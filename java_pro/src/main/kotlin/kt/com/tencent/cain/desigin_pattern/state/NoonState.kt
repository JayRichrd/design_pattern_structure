package kt.com.tencent.cain.desigin_pattern.state

/**
 * @author : jiangyu
 * @date   : 2020/3/28
 * @desc   : xxx
 */
class NoonState : State() {
    override fun doWork(work: Work) {
        if (work.curTimeHour <= 13) {
            println("当前时间：${work.curTimeHour}点，属于午休时间")
        } else {
            work.state = AfterNoonState()
            work.doWork()
        }
    }
}