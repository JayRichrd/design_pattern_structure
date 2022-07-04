package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-18
 * 简单工厂设计模式
 */
public class SimpleFactoryPattern {
    public static void main(String[] args) {
        operation(1.0, 2.0, OperationFactory.OperationType.OPERATION_ADD);
        operation(3.0, 4.0, OperationFactory.OperationType.OPERATION_SUB);
        operation(5.0, 6.0, OperationFactory.OperationType.OPERATION_MUL);
        operation(7.0, 8.0, OperationFactory.OperationType.OPERATION_DIV);
    }

    static void operation(double numA, double numB, OperationFactory.OperationType operationType) {
        System.out.println();
        Operation operation = OperationFactory.creatOperation(operationType);
        operation.numA = numA;
        operation.numB = numB;
        System.out.println(operationType.operationDes + ": " + operation.getNumA() + " " + operationType.operationType + " " + operation.getNumB() + " = " + operation.getResult());
    }
}
