package jv.com.tencent.cain.design_pattern.factory_method;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class SubFactory implements IOperationFactory {
    @Override
    public Operation createOpration() {
        SubOperation subOperation = new SubOperation();
        subOperation.operationSymbol = "-";
        subOperation.operationName = "减法";
        return subOperation;
    }

}
