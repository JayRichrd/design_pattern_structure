package jv.com.tencent.cain.design_pattern.singleton;

/**
 * @author : jiangyu
 * @date : 2020/7/5
 * @desc : 单例设计模式-双重锁检查模式
 *
 */
public class DoubleCheckedLockSingleton {
    // 关键字volatile, 禁止JVM对这个对象涉及到的代码重排序
    private static volatile DoubleCheckedLockSingleton instance = null;

    private DoubleCheckedLockSingleton() {
    }

    public static DoubleCheckedLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockSingleton.class) {
                // 再次判断, 因为可能出现两个线程同时进入第一层if逻辑进入，当某个线程持有锁创建对象后
                // 另一个线程也会马上持有锁并试图再次创建对象
                if (instance == null) {
                    instance = new DoubleCheckedLockSingleton();
                }
            }
        }
        return instance;
    }
}
