package kt.com.tencent.cain.desigin_pattern.fly_weight

/**
 * @author cainjiang
 * @date 2020/8/14
 */
fun main() {
    var externalState = 20
    val flyWeightFactory = FlyWeightFactory()

    val flyWeightA = flyWeightFactory.getFlyWeightByName("a")
    flyWeightA?.operation(externalState--)

    val flyWeightB = flyWeightFactory.getFlyWeightByName("b")
    flyWeightB?.operation(externalState--)

    val flyWeightC = flyWeightFactory.getFlyWeightByName("c")
    flyWeightC?.operation(externalState--)

    val flyWeightA1 = flyWeightFactory.getFlyWeightByName("a")
    flyWeightA1?.operation(externalState--)

    val unSharedFlyWeight = flyWeightFactory.unSharedFlyWeight
    unSharedFlyWeight.operation(externalState--)

    val flyWeightB1 = flyWeightFactory.getFlyWeightByName("b")
    flyWeightB1?.operation(externalState)

    println("flyweiht count = ${flyWeightFactory.getFlyWeightCount()}")

}