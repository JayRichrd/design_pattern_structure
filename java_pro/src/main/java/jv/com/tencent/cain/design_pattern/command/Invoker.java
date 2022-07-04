package jv.com.tencent.cain.design_pattern.command;

/**
 * @author cainjiang
 * @date 2020/7/20
 */
public class Invoker {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public Invoker(AbstractCommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
