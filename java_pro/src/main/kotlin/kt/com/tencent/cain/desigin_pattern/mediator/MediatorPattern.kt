package kt.com.tencent.cain.desigin_pattern.mediator

/**
 * @author : jiangyu
 * @date   : 2020/8/13
 * @desc   : xxx
 */

fun main() {
    val mediator = ConcreteMediator()
    val colleague1 = Colleague1(mediator)
    mediator.colleague1 = colleague1
    val colleague2 = Colleague2(mediator)
    mediator.colleague2 = colleague2


    colleague1.send("吃饭了吗？")
    colleague2.send("还没有呢，要请客嘛？")
}