package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
abstract class Visitor {
    protected String name;

    public String getName() {
        return name;
    }


    public Visitor(String name) {
        this.name = name;
    }

    abstract void visitConcrectElementA(ConcrectElementA concrectElementA);

    abstract void visitConcrectElementB(ConcrectElementB concrectElementB);
}
