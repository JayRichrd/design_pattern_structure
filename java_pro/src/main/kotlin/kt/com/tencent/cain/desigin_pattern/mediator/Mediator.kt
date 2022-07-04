package kt.com.tencent.cain.desigin_pattern.mediator

/**
 * @author : jiangyu
 * @date   : 2020/8/13
 * @desc   : xxx
 */
abstract class Mediator {
    abstract fun send(sender: Colleague, msg: String)
}