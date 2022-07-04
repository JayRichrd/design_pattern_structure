package jv.com.tencent.cain.design_pattern.decorator;

/**
 * @author cainjiang
 * @date 2019-03-31
 * 装饰者的父类，持有一个被装饰者的引用
 */
public class Finery extends Person {
    private Person compenent;

    protected void decorate(Person compenent) {
        this.compenent = compenent;
    }

    @Override
    protected void show() {
        if (compenent != null) {
            compenent.show();
        }
    }
}
