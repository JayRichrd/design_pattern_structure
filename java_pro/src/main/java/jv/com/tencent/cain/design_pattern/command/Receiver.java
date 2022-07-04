package jv.com.tencent.cain.design_pattern.command;

/**
 * @author cainjiang
 * @date 2020/7/20
 * 真正的执行者，执行具体的命令
 */
public class Receiver {
    public void action() {
        System.out.println("执行命令");
    }
}
