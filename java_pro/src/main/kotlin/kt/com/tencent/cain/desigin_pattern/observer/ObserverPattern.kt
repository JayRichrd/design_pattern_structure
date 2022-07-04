package kt.com.tencent.cain.desigin_pattern.observer

/**
 * @author : jiangyu
 * @date   : 2020/3/3
 * @desc   : 观察者设计模式
 */
fun main() {
    val subject = ConcreteSubject()

    val nbaObserver: Observer = NBAObserver()
    val cartoonObserver: Observer = CartoonObserver()

    subject.addObserver(nbaObserver)
    subject.addObserver(cartoonObserver)

    subject.notifyAll("老大回来了")
    subject.notify(cartoonObserver, "老师来了")
}