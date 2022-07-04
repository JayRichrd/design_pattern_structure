package jv.com.tencent.cain.design_pattern.mediator;

/**
 * @author cainjiang
 * @date 2020/8/13
 */
public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void notify(String msg) {
        System.out.println(getName()+"收到消息：" + msg);
    }

    @Override
    void send(String msg) {
        if (mediator != null) {
            mediator.send(this,msg);
        }
    }

    @Override
    String getName() {
        return "Colleague2";
    }
}
