package kt.com.tencent.cain.desigin_pattern.fly_weight

/**
 * @author cainjiang
 * @date 2020/8/14
 */
class FlyWeight : BaseFlyWeight() {
    override fun operation(externalState: Int) {
        println("具体的共享元, externalState: $externalState")
    }
}