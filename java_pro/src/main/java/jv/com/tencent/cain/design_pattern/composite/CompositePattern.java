package jv.com.tencent.cain.design_pattern.composite;

/**
 * @author cainjiang
 * @date 2020/5/7
 */
public class CompositePattern {
    public static void main(String[] args) {
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite composite = new Composite("Composite X");
        composite.add(new Leaf("Leaf XA"));
        composite.add(new Leaf("Leaf XB"));
        root.add(composite);

        Composite composite1 = new Composite("Composite XY");
        composite1.add(new Leaf("Leaf XYA"));
        composite1.add(new Leaf("Leaf XYB"));
        root.add(composite1);

        root.add(new Leaf("Leaf C"));
        Leaf leaf = new Leaf("D");
        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
