package jv.com.tencent.cain.design_pattern.factory_method;

/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class AddFactory implements IOperationFactory {
    @Override
    public Operation createOpration() {
        AddOperation addOperation = new AddOperation();
        addOperation.operationSymbol = "+";
        addOperation.operationName = "加法";
        return addOperation;
    }

}
