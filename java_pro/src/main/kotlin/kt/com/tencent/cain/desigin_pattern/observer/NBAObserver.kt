package kt.com.tencent.cain.desigin_pattern.observer

/**
 * @author : jiangyu
 * @date   : 2020/3/3
 * @desc   : xxx
 */
class NBAObserver : Observer {
    override fun update(subject: Subject, data: Any) {
        println("我是${this.javaClass.simpleName},${data}比看NBA了")
    }
}