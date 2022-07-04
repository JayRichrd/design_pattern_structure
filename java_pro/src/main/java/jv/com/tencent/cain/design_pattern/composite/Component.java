package jv.com.tencent.cain.design_pattern.composite;

/**
 * @author cainjiang
 * @date 2020/5/7
 * 组合设计模式公共部分
 */
abstract class Component {
    protected String name;

    public Component() { }

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void display(int depth);

    @Override
    public String toString() {
        return new StringBuilder("componet[")
                .append("name: ")
                .append(name)
                .append("]")
                .toString();
    }
}
