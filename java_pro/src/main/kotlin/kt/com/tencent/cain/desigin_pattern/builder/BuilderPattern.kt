package kt.com.tencent.cain.desigin_pattern.builder

/**
 * @author : jiangyu
 * @date   : 2020/2/10
 * @desc   : 构建者设计模式
 */

fun main() {
    val director = Director()
    val builder1 = ConcreteBuilder1()
    val builder2 = ConcreteBuilder2()

    director.construct(builder1)
    val product1 = builder1.getResult()
    product1.show()

    println()

    director.construct(builder2)
    val product2 = builder2.getResult()
    product2.show()
}