package kt.com.tencent.cain.desigin_pattern.memento

/**
 * @author : jiangyu
 * @date   : 2020/4/17
 * @desc   : 备忘录设计模式
 */
fun main() {
    val originator = Originator()
    val careTaker = CareTaker()
    originator.state = "---state 1---"
    careTaker.addMemento(originator.saveStateMemento())
    originator.state = "---state 2---"
    careTaker.addMemento(originator.saveStateMemento())
    originator.state = "---state 3---"
    careTaker.addMemento(originator.saveStateMemento())

    careTaker.getMemento(0)?.let {
        originator.setStateMemento(it)
        println("cur state: ${originator.state}")
    }
    careTaker.getMemento(1)?.let {
        originator.setStateMemento(it)
        println("cur state: ${originator.state}")
    }
    careTaker.getMemento(2)?.let {
        originator.setStateMemento(it)
        println("cur state: ${originator.state}")
    }
}