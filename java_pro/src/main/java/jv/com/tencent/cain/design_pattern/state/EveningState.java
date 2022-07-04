package jv.com.tencent.cain.design_pattern.state;

/**
 * @author cainjiang
 * @date 2020/3/27
 */
public class EveningState extends State {
    @Override
    public void doWork(Work work) {
        if (work.isFinished()) {
            work.setState(new ResetState());
            work.doWork();
        } else if (work.getHour() < 21) {
            System.out.println("当前时间：" + work.getHour() + ", 属于晚上加班时间");
        } else {
            System.out.println("当前时间：" + work.getHour() + ",现在已经很晚了，今天先下班休息吧，身体最重要");
            work.setState(new ResetState());
            work.doWork();
        }
    }
}
