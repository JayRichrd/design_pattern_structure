package jv.com.tencent.cain.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : jiangyu
 * @date : 2020/3/3
 * @desc : xxx
 */
public class ConcreteSubject implements Subject {
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void removeAll() {
        observerList.clear();
    }

    @Override
    public void notifyAllObserver(Object data) {
        for (Observer observer : observerList) {
            observer.update(this, data);
        }
    }

    @Override
    public void notify(Observer observer, Object data) {
        if (observer != null) {
            observer.update(this, data);
        }
    }
}
