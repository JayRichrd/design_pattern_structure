package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
public class ConcrectElementA extends Element {
    public ConcrectElementA() {
        super(ElementType.MALE);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitConcrectElementA(this);
    }
}
