package kt.com.tencent.cain.desigin_pattern.composite

/**
 * @author cainjiang
 * @date 2020/5/7
 */
class Leaf(name:String) : Component(name) {
    companion object {
        const val TAG = "Leaf"
    }

    override fun add(component: Component) {
        println(TAG + "#add# can't add componet to leaf.")
    }

    override fun remove(component: Component) {
        println(TAG + "#add# can't remove componet from leaf.")
    }

    override fun display(depth: Int) {
        val depthBuilder = StringBuilder()
        for (i in 0 until depth) {
            depthBuilder.append("-")
        }
        depthBuilder.append(name)
        println(depthBuilder)
    }
}