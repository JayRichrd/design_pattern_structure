package kt.com.tencent.cain.desigin_pattern.proxy

/**
 * @author : jiangyu
 * @date   : 2019-05-18
 * @desc   : 代理设计模式中的Proxy
 */
class Proxy(
    schoolGirl: SchoolGirl = SchoolGirl(),
    private val pursuit: Pursuit = Pursuit(schoolGirl)
) : IGiveGift {

    override fun giveDolls() {
        pursuit.giveDolls()
    }

    override fun giveFlowers() {
        pursuit.giveFlowers()
    }

    override fun giveChocolate() {
        pursuit.giveChocolate()
    }
}