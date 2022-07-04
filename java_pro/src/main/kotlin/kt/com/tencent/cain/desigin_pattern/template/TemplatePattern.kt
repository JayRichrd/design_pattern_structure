package kt.com.tencent.cain.desigin_pattern.template

/**
 * @author : jiangyu
 * @date   : 2019/11/3
 * @desc   : 模版设计模式
 */
fun main() {
    lateinit var template: TemplateAbstract
    template = TemplateConcrete1()
    template.templateMethod()
    template = TemplateConcrete2()
    template.templateMethod()
}