package jv.com.tencent.cain.design_pattern.singleton;

/**
 * @author : jiangyu
 * @date : 2020/7/5
 * @desc : 单例设计模式-静态内部类实现
 * 线程安全, 懒惰模式的一种, 用到时再加载
 * 优点：没有加锁, 线程安全, 用到时再加载, 并发行能高
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton() {
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }

    /**
     * JVM在加载外部类的过程中, 是不会加载静态内部类的,
     * 只有内部类(SingletonHolder)的属性/方法被调用时才会被加载, 并初始化其静态属性(instance)
     */
    private static class SingletonHolder {
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }
}
