package jv.com.tencent.cain.design_pattern.mediator;

/**
 * @author cainjiang
 * @date 2020/8/13
 */
abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    abstract void notify(String msg);

    abstract void  send(String msg);

    abstract String  getName();
}
