package kt.com.tencent.cain.desigin_pattern.memento

/**
 * @author : jiangyu
 * @date   : 2020/4/17
 * @desc   : 备忘录设计模式中的CareTaker
 */
class CareTaker {

    private val mementoList by lazy { mutableListOf<Memento>() }

    fun addMemento(memento: Memento) {
        mementoList.add(memento)
    }

    fun getMemento(index: Int): Memento? = mementoList[index]
}