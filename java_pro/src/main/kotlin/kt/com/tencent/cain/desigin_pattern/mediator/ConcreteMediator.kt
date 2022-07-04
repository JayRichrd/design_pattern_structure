package kt.com.tencent.cain.desigin_pattern.mediator

/**
 * @author : jiangyu
 * @date   : 2020/8/13
 * @desc   : xxx
 */
class ConcreteMediator(var colleague1: Colleague? = null, var colleague2: Colleague? = null) : Mediator() {

    override fun send(sender: Colleague, msg: String) {
        when {
            sender is Colleague1 -> {
                colleague2?.notify(msg)
            }
            sender is Colleague2 -> {
                colleague1?.notify(msg)
            }
            else -> {
                println("nothing to do!")
            }
        }
    }
}