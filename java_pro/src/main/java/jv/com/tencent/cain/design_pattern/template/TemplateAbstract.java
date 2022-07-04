package jv.com.tencent.cain.design_pattern.template;

/**
 * @author : jiangyu
 * @date : 2019/11/3
 * @desc :模版设计模式的模版父类
 */
public abstract class TemplateAbstract {
    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }
    /**
     * 留给具体的子类去实现的方法
     */
    abstract void primitiveOperation1();

    abstract void primitiveOperation2();
}
