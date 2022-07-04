package kt.com.tencent.cain.desigin_pattern.composite

/**
 * @author cainjiang
 * @date 2020/5/7
 * 组合设计模式公共部分
 */
abstract class Component(val name: String = "") {
    abstract fun add(component: Component)
    abstract fun remove(component: Component)
    abstract fun display(depth: Int)
    override fun toString() = StringBuilder("componet[").append("name: ").append(name).append("]").toString()
}