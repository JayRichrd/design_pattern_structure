package kt.com.tencent.cain.desigin_pattern.observer

/**
 * @author : jiangyu
 * @date   : 2020/3/3
 * @desc   : xxx
 */
class ConcreteSubject(val observerList: MutableList<Observer> = mutableListOf()) : Subject {
    override fun addObserver(observer: Observer) {
        observerList.add(observer)
    }

    override fun remove(observer: Observer) {
        observerList.remove(observer)
    }

    override fun removeAll() {
        observerList.clear()
    }

    override fun notifyAll(data: Any) {
        observerList.forEach { observer ->
            observer.update(this, data)
        }
    }

    override fun notify(observer: Observer, data: Any) {
        observer.update(this, data)
    }
}