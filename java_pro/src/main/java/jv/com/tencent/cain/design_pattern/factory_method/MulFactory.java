package jv.com.tencent.cain.design_pattern.factory_method;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class MulFactory implements IOperationFactory {
    @Override
    public Operation createOpration() {
        MulOperation mulOperation = new MulOperation();
        mulOperation.operationSymbol = "*";
        mulOperation.operationName = "乘法";
        return mulOperation;
    }

}
