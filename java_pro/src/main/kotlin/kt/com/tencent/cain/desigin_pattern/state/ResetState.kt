package kt.com.tencent.cain.desigin_pattern.state

/**
 * @author : jiangyu
 * @date   : 2020/3/28
 * @desc   : xxx
 */
class ResetState : State() {
    override fun doWork(work: Work) {
        println("下班了")
    }
}