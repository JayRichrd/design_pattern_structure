package jv.com.tencent.cain.design_pattern.command;

/**
 * @author cainjiang
 * @date 2020/7/20
 */
public class ConcrectCommand extends AbstractCommand {

    public ConcrectCommand(Receiver receiver) {
        super(receiver);
    }

    @Override
    void execute() {
        /**
         * 具体的执行
         */
        receiver.action();
    }
}
