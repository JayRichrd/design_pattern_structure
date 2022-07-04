package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
abstract class Element {
    protected ElementType type;

    public Element(ElementType type) {
        this.type = type;
    }

    public ElementType getType() {
        return type;
    }

    abstract void accept(Visitor visitor);
}
