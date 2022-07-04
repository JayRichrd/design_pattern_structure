package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
abstract class Visitor(val name:String) {
    abstract fun visitorConcrectC(concrectElementC: ConcrectElementC)
    abstract fun visitorConcrectD(concrectElementD: ConcrectElementD)
}