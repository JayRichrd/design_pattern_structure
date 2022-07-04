package kt.com.tencent.cain.desigin_pattern.mediator

/**
 * @author : jiangyu
 * @date   : 2020/8/13
 * @desc   : xxx
 */
class Colleague2(mediator: Mediator) : Colleague(mediator) {
    override fun send(msg: String) {
        mediator.send(this, msg)
    }

    override fun notify(msg: String) {
        println("${getName()} 收到消息: $msg")
    }

    override fun getName(): String = "Colleague2"
}