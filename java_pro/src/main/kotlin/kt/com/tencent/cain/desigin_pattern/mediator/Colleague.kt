package kt.com.tencent.cain.desigin_pattern.mediator

/**
 * @author : jiangyu
 * @date   : 2020/8/13
 * @desc   : xxx
 */
abstract class Colleague(val mediator: Mediator) {
    abstract fun send(msg: String)
    abstract fun notify(msg: String)
    abstract fun getName(): String
}