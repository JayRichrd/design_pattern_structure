package kt.com.tencent.cain.desigin_pattern.proxy

/**
 * @author : jiangyu
 * @date   : 2019-05-18
 * @desc   : 代理设计模式
 */
fun main() {
    val schoolGirl = SchoolGirl("Linda")
    val proxy = Proxy(schoolGirl)
    proxy.giveChocolate()
    proxy.giveDolls()
    proxy.giveFlowers()
}