package kt.com.tencent.cain.desigin_pattern.facade

/**
 * @author : jiangyu
 * @date   : 2020/2/5
 * @desc   : xxx
 */
class FacadeSystem {
    val subSystemOne: SubSystemOne by lazy { SubSystemOne() }
    val subSystemTwo: SubSystemTwo by lazy { SubSystemTwo() }
    val subSystemThree: SubSystemThree by lazy { SubSystemThree() }

    fun funcA() {
        println("---方法组A---")
        subSystemOne.funcOne()
        subSystemTwo.funcTwo()
        println()
    }

    fun funcB() {
        println("---方法组B---")
        subSystemOne.funcOne()
        subSystemThree.funcThree()
        println()
    }

    fun funcC() {
        println("---方法组C---")
        subSystemTwo.funcTwo()
        subSystemThree.funcThree()
        println()
    }
}