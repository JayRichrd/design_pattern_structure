package jv.com.tencent.cain.design_pattern.factory_method;

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
