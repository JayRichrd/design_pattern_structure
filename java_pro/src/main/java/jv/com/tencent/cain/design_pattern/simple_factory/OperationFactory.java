package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-22
 * 构建具体操作类的工厂类
 */
public class OperationFactory {

    /**
     * 操作类型
     */
    enum OperationType {
        //加法
        OPERATION_ADD("+", "加法"),
        //减法
        OPERATION_SUB("-", "减法"),
        //乘法
        OPERATION_MUL("*", "乘法"),
        //除法
        OPERATION_DIV("/", "除法");

        public String operationType;
        public String operationDes;

        OperationType(String operationType, String operationDes) {
            this.operationType = operationType;
            this.operationDes = operationDes;
        }
    }

    /**
     * 创建并返回具体的操作类
     *
     * @param operationType
     * @return
     */
    static Operation creatOperation(OperationType operationType) {
        Operation operation = null;
        switch (operationType) {
            case OPERATION_ADD:
                operation = new AddOperation();
                break;
            case OPERATION_SUB:
                operation = new SubOperation();
                break;
            case OPERATION_MUL:
                operation = new MulOperation();
                break;
            case OPERATION_DIV:
                operation = new DivOperation();
                break;
            default:
                System.out.println("请输入合适的运算类型!");
                break;
        }
        return operation;
    }
}
