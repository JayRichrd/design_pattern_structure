package kt.com.tencent.cain.desigin_pattern.state

/**
 * @author : jiangyu
 * @date   : 2020/3/28
 * @desc   : xxx
 */
class EveningState : State() {
    override fun doWork(work: Work) {
        if (work.isFinished) {
            println("工作已经完成，可以下班了")
            work.state = ResetState()
            work.doWork()
        } else if (work.curTimeHour < 21) {
            println("当前时间：${work.curTimeHour}点，工作还未完成，需要加班")
        } else {
            println("当前时间：${work.curTimeHour}点，夜深了，注意身体，请下班休息")
            work.state = ResetState()
            work.doWork()
        }
    }
}