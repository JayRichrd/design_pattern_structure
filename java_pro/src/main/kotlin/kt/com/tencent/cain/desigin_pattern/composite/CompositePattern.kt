package kt.com.tencent.cain.desigin_pattern.composite


/**
 * @author cainjiang
 * @date 2020/5/7
 */
fun main() {
    val root = Composite("root")
    root.add(Leaf("Leaf A"))
    root.add(Leaf("Leaf B"))

    val composite = Composite("Composite X")
    composite.add(Leaf("Leaf XA"))
    composite.add(Leaf("Leaf XB"))
    root.add(composite)

    val composite1 = Composite("Composite XY")
    composite1.add(Leaf("Leaf XYA"))
    composite1.add(Leaf("Leaf XYB"))
    root.add(composite1)

    root.add(Leaf("Leaf C"))

    val leaf = Leaf("D")
    root.add(leaf)
    root.remove(leaf)

    root.display(1)
}