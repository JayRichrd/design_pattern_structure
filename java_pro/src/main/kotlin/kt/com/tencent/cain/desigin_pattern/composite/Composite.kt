package kt.com.tencent.cain.desigin_pattern.composite

/**
 * @author cainjiang
 * @date 2020/5/7
 */
class Composite(name: String = "", val children: MutableList<Component> = mutableListOf()) : Component(name) {
    companion object {
        const val TAG = "Composite"
    }

    override fun add(component: Component) {
        println(TAG + "#add# component: $component")
        children.add(component)
    }

    override fun remove(component: Component) {
        if (children.remove(component)) {
            println(TAG + "#remove# component: $component")
        }
    }

    override fun display(depth: Int) {
        val depthBuilder = StringBuilder()
        for (i in 0 until depth) {
            depthBuilder.append("-")
        }
        depthBuilder.append(name)
        println(depthBuilder)
        children.forEach { it.display(depth + 1) }
    }
}