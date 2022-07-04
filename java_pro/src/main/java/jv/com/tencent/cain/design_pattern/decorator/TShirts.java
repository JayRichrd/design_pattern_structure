package jv.com.tencent.cain.design_pattern.decorator;

/**
 * @author cainjiang
 * @date 2019-03-31
 * 具体的装饰者
 */
public class TShirts extends Finery {
    @Override
    protected void show() {
        System.out.print("大T恤 ");
        super.show();
    }
}
