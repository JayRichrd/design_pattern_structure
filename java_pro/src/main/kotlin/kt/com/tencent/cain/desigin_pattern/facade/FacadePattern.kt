package kt.com.tencent.cain.desigin_pattern.facade

/**
 * @author : jiangyu
 * @date   : 2020/2/5
 * @desc   : 外观设计模式
 */
fun main() {
    val facadeSystem = FacadeSystem()
    facadeSystem.funcA()
    facadeSystem.funcB()
    facadeSystem.funcC()
}
