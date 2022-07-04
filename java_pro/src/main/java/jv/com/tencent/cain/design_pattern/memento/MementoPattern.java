package jv.com.tencent.cain.design_pattern.memento;

/**
 * @author : jiangyu
 * @date : 2020/4/17
 * @desc : 备忘录设计模式
 */
public class MementoPattern {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("###state 1###");
        careTaker.addMomento(originator.saveStateMemento());
        originator.setState("###state 2###");
        careTaker.addMomento(originator.saveStateMemento());
        originator.setState("###state 3###");
        careTaker.addMomento(originator.saveStateMemento());

        originator.setStateMemento(careTaker.getMemento(0));
        System.out.println("cur state: " + originator.getState());
        originator.setStateMemento(careTaker.getMemento(1));
        System.out.println("cur state: " + originator.getState());
        originator.setStateMemento(careTaker.getMemento(2));
        System.out.println("cur state: " + originator.getState());
    }
}
