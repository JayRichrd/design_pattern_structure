package jv.com.tencent.cain.design_pattern.mediator;

/**
 * @author cainjiang
 * @date 2020/8/13
 */
abstract class Mediator {
    abstract void send(Colleague colleague, String msg);
}
