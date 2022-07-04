package kt.com.tencent.cain.desigin_pattern.builder

/**
 * @author : jiangyu
 * @date   : 2020/2/10
 * @desc   : xxx
 */
class ConcreteBuilder2(val product: Product = Product()) : Builder() {
    override fun buildPartA() {
        product.parts.add("部件X")
    }

    override fun buildPartB() {
        product.parts.add("部件Y")
    }

    override fun getResult(): Product = product
}