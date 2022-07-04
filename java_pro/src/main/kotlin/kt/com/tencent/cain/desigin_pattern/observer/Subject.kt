package kt.com.tencent.cain.desigin_pattern.observer

/**
 * @author : jiangyu
 * @date   : 2020/3/3
 * @desc   : 观察者设计模式-通知者
 */
interface Subject {
    /**
     * 添加观察者
     */
    fun addObserver(observer: Observer)

    /**
     * 移除观察者
     */
    fun remove(observer: Observer)

    /**
     * 全部移除
     */
    fun removeAll()

    /**
     * 通知所有观察者
     */
    fun notifyAll(data: Any)

    /**
     * 通知某个观察者
     */
    fun notify(observer: Observer, data: Any)
}