package jv.com.tencent.cain.design_pattern.template;

/**
 * @author : jiangyu
 * @date : 2019/11/3
 * @desc : 模版设计模式的子类
 */
public class TemplateConcrete1 extends TemplateAbstract {
    @Override
    void primitiveOperation1() {
        System.out.println("---TemplateConcrete1#primitiveOperation1---");
    }

    @Override
    void primitiveOperation2() {
        System.out.println("---TemplateConcrete1#primitiveOperation2---");
    }
}
