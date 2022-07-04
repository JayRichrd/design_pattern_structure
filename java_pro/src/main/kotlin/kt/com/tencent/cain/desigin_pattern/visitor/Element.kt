package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
abstract class Element(val elementType: VisitorElementType) {
    abstract fun accept(visitor: Visitor)
}