package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-22
 * 乘法操作类
 */
public class MulOperation extends Operation {
    @Override
    public double getResult() {
        return numA * numB;
    }
}
