package jv.com.tencent.cain.design_pattern.mediator;

/**
 * @author cainjiang
 * @date 2020/8/13
 */
public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    @Override
    void send(Colleague colleague, String msg) {
        if (colleague instanceof ConcreteColleague1 && colleague2 != null) {
            colleague2.notify(msg);
        } else if (colleague instanceof ConcreteColleague2 && colleague != null) {
            colleague1.notify(msg);
        }
    }

    public ConcreteMediator setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
        return this;
    }

    public ConcreteMediator setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
        return this;
    }
}
