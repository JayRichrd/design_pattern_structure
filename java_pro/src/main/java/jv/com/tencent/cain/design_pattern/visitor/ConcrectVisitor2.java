package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
public class ConcrectVisitor2 extends Visitor {
    public ConcrectVisitor2() {
        super("No.2 Visitor");
    }

    @Override
    void visitConcrectElementA(ConcrectElementA concrectElementA) {
        System.out.println(concrectElementA.getType().name + " 被 " + this.name + " 访问了");
    }

    @Override
    void visitConcrectElementB(ConcrectElementB concrectElementB) {
        System.out.println(concrectElementB.getType().name + " 被 " + this.name + " 访问了");

    }
}
