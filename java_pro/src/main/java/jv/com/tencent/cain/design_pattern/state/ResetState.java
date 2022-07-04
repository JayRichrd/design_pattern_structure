package jv.com.tencent.cain.design_pattern.state;

/**
 * @author cainjiang
 * @date 2020/3/27
 */
public class ResetState extends State {
    @Override
    public void doWork(Work work) {
        System.out.println("当前时间：" + work.getHour() + ",终于可以下班休息了");
    }
}
