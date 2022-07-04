package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
class ConcrectVisitorTwo : Visitor("Two") {
    override fun visitorConcrectC(concrectElementC: ConcrectElementC) {
        println("${concrectElementC.elementType.typeName} 被 ${this.name} 访问")
    }

    override fun visitorConcrectD(concrectElementD: ConcrectElementD) {
        println("${concrectElementD.elementType.typeName} 被 ${this.name} 访问")
    }
}