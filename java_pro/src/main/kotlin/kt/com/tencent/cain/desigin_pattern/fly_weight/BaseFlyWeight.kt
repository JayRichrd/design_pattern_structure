package kt.com.tencent.cain.desigin_pattern.fly_weight

/**
 * @author cainjiang
 * @date 2020/8/14
 */
abstract class BaseFlyWeight {
    abstract fun operation(externalState: Int)
}