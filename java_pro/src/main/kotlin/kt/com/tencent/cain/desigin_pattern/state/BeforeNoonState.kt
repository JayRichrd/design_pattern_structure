package kt.com.tencent.cain.desigin_pattern.state

/**
 * @author : jiangyu
 * @date   : 2020/3/28
 * @desc   : xxx
 */
class BeforeNoonState : State() {
    override fun doWork(work: Work) {
        if (work.curTimeHour < 12) {
            println("当前时间：${work.curTimeHour}点，属于上午上班时间")
        } else {
            work.state = NoonState()
            work.doWork()
        }
    }
}