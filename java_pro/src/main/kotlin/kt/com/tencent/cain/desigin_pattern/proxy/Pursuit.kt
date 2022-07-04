package kt.com.tencent.cain.desigin_pattern.proxy

/**
 * @author : jiangyu
 * @date   : 2019-05-18
 * @desc   : 代理设计模式中的RealSubject
 */
class Pursuit(private val schoolGirl: SchoolGirl = SchoolGirl()) : IGiveGift {

    override fun giveDolls() {
        println("${schoolGirl.name}送你洋娃娃")
    }

    override fun giveFlowers() {
        println("${schoolGirl.name}送你鲜花💐")
    }

    override fun giveChocolate() {
        println("${schoolGirl.name}送你巧克力🍫")
    }
}