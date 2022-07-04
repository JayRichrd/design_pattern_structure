package jv.com.tencent.cain.design_pattern.command;

/**
 * @author cainjiang
 * @date 2020/7/20
 */
public abstract class AbstractCommand {
    protected Receiver receiver;

    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 执行
     */
    abstract void execute();
}
