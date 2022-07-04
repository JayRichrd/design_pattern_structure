package jv.com.tencent.cain.design_pattern.observer;

/**
 * @author : jiangyu
 * @date : 2020/3/3
 * @desc : 观察者设计模式
 */
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();

        Observer nbaObserver = new NBAObserver();
        Observer cartoonObserver = new CartoonObserver();

        subject.addObserver(nbaObserver);
        subject.addObserver(cartoonObserver);

        subject.notifyAllObserver("老师来了");
        subject.notify(nbaObserver, "老板进来了");
    }
}
