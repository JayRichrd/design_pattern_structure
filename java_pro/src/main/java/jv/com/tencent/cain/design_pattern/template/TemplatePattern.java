package jv.com.tencent.cain.design_pattern.template;

/**
 * @author : jiangyu
 * @date : 2019/11/3
 * @desc : 模版设计模式
 */
public class TemplatePattern {
    public static void main(String[] args) {
        TemplateAbstract templateAbstract;
        templateAbstract = new TemplateConcrete1();
        templateAbstract.templateMethod();
        templateAbstract = new TemplateConcrete2();
        templateAbstract.templateMethod();
    }
}
