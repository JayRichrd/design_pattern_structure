package jv.com.tencent.cain.design_pattern.observer;

/**
 * @author : jiangyu
 * @date : 2020/3/3
 * @desc : 观察者设计模式-通知者
 */
public interface Subject {
    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 全部移除
     */
    void removeAll();

    /**
     * 通知所有观察者
     *
     * @param data
     */
    void notifyAllObserver(Object data);

    /**
     * 通知某个观察者
     *
     * @param observer
     * @param data
     */
    void notify(Observer observer, Object data);
}
