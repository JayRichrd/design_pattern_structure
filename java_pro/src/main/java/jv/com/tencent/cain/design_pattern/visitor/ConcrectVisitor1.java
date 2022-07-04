package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
public class ConcrectVisitor1 extends Visitor {

    public ConcrectVisitor1() {
        super("No.1 Visitor");
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
