package jv.com.tencent.cain.design_pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : jiangyu
 * @date : 2020/4/17
 * @desc : 备忘录设计模式中的CareTaker
 */
public class CareTaker {
    List<Memento> mementoList = new ArrayList<>();

    public void addMomento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        Memento memento = null;
        if (!mementoList.isEmpty()) {
            memento = mementoList.get(index);
        }
        return memento;
    }
}
