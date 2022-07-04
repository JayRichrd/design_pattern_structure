package jv.com.tencent.cain.design_pattern.factory_method;


/**
 * @author cainjiang
 * @date 2019-05-20
 */
public class FactoryMethodPattern {
    public static void main(String[] args) {
        operation(1.0, 2.0, new AddFactory().createOpration());
        operation(3.0, 4.0, new SubFactory().createOpration());
        operation(5.0, 6.0, new MulFactory().createOpration());
        operation(7.0, 8.0, new DividFactory().createOpration());
    }

    static void operation(double numA, double numB, Operation operationSubject) {
        System.out.println();
        operationSubject.numA = numA;
        operationSubject.numB = numB;
        System.out.println(operationSubject.operationName + ": " + operationSubject.getNumA() + " " + operationSubject.operationSymbol + " " + operationSubject.getNumB() + " = " + operationSubject.getResult());
    }
}
