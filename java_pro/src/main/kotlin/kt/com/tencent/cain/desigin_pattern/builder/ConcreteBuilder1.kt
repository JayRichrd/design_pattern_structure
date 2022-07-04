package kt.com.tencent.cain.desigin_pattern.builder

/**
 * @author : jiangyu
 * @date   : 2020/2/10
 * @desc   : xxx
 */
class ConcreteBuilder1(val product: Product = Product()) : Builder() {

    override fun buildPartA() {
        product.parts.add("部件A")
    }

    override fun buildPartB() {
        product.parts.add("部件B")
    }

    override fun getResult(): Product = product
}