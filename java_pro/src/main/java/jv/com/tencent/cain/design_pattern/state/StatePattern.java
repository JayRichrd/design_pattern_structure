package jv.com.tencent.cain.design_pattern.state;

/**
 * @author cainjiang
 * @date 2020/3/27
 * 状态设计模式
 */
public class StatePattern {
    public static void main(String[] args) {
        Work emergencyProject = new Work();
        emergencyProject.setHour(9);
        emergencyProject.doWork();
        emergencyProject.setHour(10);
        emergencyProject.doWork();
        emergencyProject.setHour(15);
        emergencyProject.doWork();
        emergencyProject.setFinished(false);
        emergencyProject.setHour(19);
        emergencyProject.doWork();
        emergencyProject.setFinished(true);
        emergencyProject.doWork();
    }
}
