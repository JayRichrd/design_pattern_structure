package kt.com.tencent.cain.desigin_pattern.builder

/**
 * @author : jiangyu
 * @date   : 2020/2/10
 * @desc   : xxx
 */
class Director {

    fun construct(builder: Builder) {
        builder.buildPartB()
        builder.buildPartA()
    }
}