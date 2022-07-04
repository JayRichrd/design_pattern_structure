package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
class ConcrectElementD : Element(VisitorElementType.TYPE_FMALE) {
    override fun accept(visitor: Visitor) {
        visitor.visitorConcrectD(this)
    }
}