package jv.com.tencent.cain.design_pattern.memento;

/**
 * @author : jiangyu
 * @date : 2020/4/17
 * @desc : 备忘录设计模式中的Memento
 */
public class Memento {
    private String state;

    public Memento() { }

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
