package jv.com.tencent.cain.design_pattern.command;

/**
 * @author cainjiang
 * @date 2020/7/20
 */
public class CommandPattern {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        AbstractCommand command = new ConcrectCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.executeCommand();
    }
}
