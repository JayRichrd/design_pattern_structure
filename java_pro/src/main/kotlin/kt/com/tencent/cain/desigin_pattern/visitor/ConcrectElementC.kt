package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
class ConcrectElementC : Element(VisitorElementType.TYPE_MALE) {
    override fun accept(visitor: Visitor) {
        visitor.visitorConcrectC(this)
    }
}