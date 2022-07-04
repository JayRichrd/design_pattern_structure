package jv.com.tencent.cain.design_pattern.memento;

/**
 * @author : jiangyu
 * @date : 2020/4/17
 * @desc : 备忘录设计模式中的Originator
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemento() {
        return new Memento(state);
    }

    public void setStateMemento(Memento memento) {
        this.state = memento.getState();
    }
}
