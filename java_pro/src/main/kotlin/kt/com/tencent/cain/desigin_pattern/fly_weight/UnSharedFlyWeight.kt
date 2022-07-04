package kt.com.tencent.cain.desigin_pattern.fly_weight

/**
 * @author cainjiang
 * @date 2020/8/14
 */
class UnSharedFlyWeight:BaseFlyWeight() {
    override fun operation(externalState: Int) {
        println("不共享的共享元, externalState: $externalState")
    }
}