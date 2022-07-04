package jv.com.tencent.cain.design_pattern.factory_method;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class DividFactory implements IOperationFactory {
    @Override
    public Operation createOpration() {
        DivOperation divOperation = new DivOperation();
        divOperation.operationSymbol = "/";
        divOperation.operationName = "除法";
        return divOperation;
    }

}
