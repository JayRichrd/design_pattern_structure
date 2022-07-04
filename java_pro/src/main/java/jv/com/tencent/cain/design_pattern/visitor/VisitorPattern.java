package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStruct objectStruct = new ObjectStruct();
        Element elementA = new ConcrectElementA();
        Element elementB = new ConcrectElementB();
        objectStruct.attach(elementA);
        objectStruct.attach(elementB);
        Visitor visitor1 = new ConcrectVisitor1();
        objectStruct.accept(visitor1);
        Visitor visitor2 = new ConcrectVisitor2();
        objectStruct.accept(visitor2);
    }
}
