package kt.com.tencent.cain.desigin_pattern.template

/**
 * @author : jiangyu
 * @date   : 2019/11/3
 * @desc   : 模版设计模式的子类
 */
class TemplateConcrete2 : TemplateAbstract() {
    override fun primitiveOperation1() {
        println("---TemplateConcrete2#primitiveOperation1---")
    }

    override fun primitiveOperation2() {
        println("---TemplateConcrete2#primitiveOperation2---")
    }
}