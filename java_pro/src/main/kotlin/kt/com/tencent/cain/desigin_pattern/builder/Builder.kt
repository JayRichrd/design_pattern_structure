package kt.com.tencent.cain.desigin_pattern.builder

/**
 * @author : jiangyu
 * @date   : 2020/2/10
 * @desc   : xxx
 */
abstract class Builder {
    abstract fun buildPartA()
    abstract fun buildPartB()
    abstract fun getResult(): Product

}