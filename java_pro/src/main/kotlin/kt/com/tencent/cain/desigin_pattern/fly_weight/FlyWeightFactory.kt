package kt.com.tencent.cain.desigin_pattern.fly_weight

import java.util.*

/**
 * @author cainjiang
 * @date 2020/8/14
 */
class FlyWeightFactory {
    private val flyWeights by lazy {
        hashMapOf<String, BaseFlyWeight>()
    }

    val unSharedFlyWeight by lazy {
        UnSharedFlyWeight()
    }

    init {
        flyWeights["A"] = FlyWeight()
        flyWeights["B"] = FlyWeight()
        flyWeights["C"] = FlyWeight()
    }

    fun getFlyWeightByName(key: String): BaseFlyWeight? {
        return flyWeights[key.toUpperCase(Locale.ENGLISH)]
    }

    fun getFlyWeightCount(): Int {
        return flyWeights.size + 1
    }

}