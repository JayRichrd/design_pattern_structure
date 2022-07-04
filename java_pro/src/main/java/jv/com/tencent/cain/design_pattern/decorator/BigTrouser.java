package jv.com.tencent.cain.design_pattern.decorator;

/**
 * @author cainjiang
 * @date 2019-03-31
 * 具体的装饰者
 */
public class BigTrouser extends Finery {
    @Override
    protected void show() {
        System.out.print("垮裤 ");
        super.show();
    }
}
