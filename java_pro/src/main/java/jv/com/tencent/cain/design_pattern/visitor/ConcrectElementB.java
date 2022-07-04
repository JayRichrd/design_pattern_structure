package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
public class ConcrectElementB extends Element {
    public ConcrectElementB() {
        super(ElementType.FMALE);
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visitConcrectElementB(this);
    }
}
