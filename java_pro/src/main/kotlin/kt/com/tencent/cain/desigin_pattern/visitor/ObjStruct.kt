package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
class ObjStruct {
    val elementList: MutableList<Element> by lazy { mutableListOf<Element>() }
    fun attachElement(element: Element) {
        elementList.add(element)
    }

    fun detachElement(element: Element) {
        elementList.remove(element)
    }

    fun visitor(visitor: Visitor) {
        elementList.forEach {
            it.accept(visitor)
        }
    }
}