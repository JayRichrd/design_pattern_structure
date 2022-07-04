package kt.com.tencent.cain.desigin_pattern.memento

/**
 * @author : jiangyu
 * @date   : 2020/4/17
 * @desc   : 备忘录设计模式中的Originator
 */
class Originator(var state: String = "") {

    fun saveStateMemento(): Memento = Memento(state)

    fun setStateMemento(memento: Memento) {
        this.state = memento.state
    }
}