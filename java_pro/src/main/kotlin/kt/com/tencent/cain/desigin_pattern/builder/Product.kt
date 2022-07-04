package kt.com.tencent.cain.desigin_pattern.builder

/**
 * @author : jiangyu
 * @date   : 2020/2/10
 * @desc   : xxx
 */
data class Product(var parts: MutableList<String> = mutableListOf()) {
    fun show() {
        println("---产品创建---")
        parts.forEach { part ->
            println(part)
        }
    }
}