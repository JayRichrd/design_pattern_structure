package jv.com.tencent.cain.design_pattern.singleton;

/**
 * @author : jiangyu
 * @date : 2020/7/5
 * @desc : 单例设计模式-饿汉写法
 * 优点: JVM层面的线程安全
 * 缺点: 造成空间的浪费
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static final HungrySingleton instance = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return instance;
    }
}
