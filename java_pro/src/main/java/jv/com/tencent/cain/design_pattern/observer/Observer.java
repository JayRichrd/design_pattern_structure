package jv.com.tencent.cain.design_pattern.observer;

/**
 * @author : jiangyu
 * @date : 2020/3/3
 * @desc : 观察者设计模式中的观察者
 */
public interface Observer {
    /**
     * 更新状态
     * @param subject
     * @param data
     */
    void update(Subject subject, Object data);
}
