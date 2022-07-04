package jv.com.tencent.cain.design_pattern.state;

/**
 * @author cainjiang
 * @date 2020/3/27
 */
public class NoonState extends State {

    @Override
    public void doWork(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + "属于午休时间");
        } else {
            work.setState(new AfterNoonState());
            work.doWork();
        }
    }
}
