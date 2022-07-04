package jv.com.tencent.cain.design_pattern.state;

/**
 * @author cainjiang
 * @date 2020/3/27
 */
public class Work {
    private State state;
    private double hour;
    private boolean isFinished;

    public Work() {
        state = new ForeNoonState();
    }

    public Work(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public void doWork() {
        state.doWork(this);
    }
}
