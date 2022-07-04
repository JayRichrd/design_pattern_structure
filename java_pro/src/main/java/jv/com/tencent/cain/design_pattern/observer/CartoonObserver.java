package jv.com.tencent.cain.design_pattern.observer;

/**
 * @author : jiangyu
 * @date : 2020/3/3
 * @desc : xxx
 */
public class CartoonObserver implements Observer {
    @Override
    public void update(Subject subject, Object data) {
        System.out.println("我是" + this.getClass().getSimpleName() + ", " + data + "别看漫画了");
    }
}
