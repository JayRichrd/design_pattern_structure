package jv.com.tencent.cain.design_pattern.state;

/**
 * @author cainjiang
 * @date 2020/3/27
 */
public class ForeNoonState extends State {
    @Override
    public void doWork(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + ", 属于上午工作时间");
        } else {
            work.setState(new NoonState());
            work.doWork();
        }
    }
}
