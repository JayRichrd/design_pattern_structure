package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-22
 * 除法操作类
 */
public class DivOperation extends Operation {
    @Override
    public double getResult() {
        if (numB == 0.0) {
            throw new IllegalArgumentException("被除数不能为0!");
        } else {
            return numA / numB;
        }
    }
}
