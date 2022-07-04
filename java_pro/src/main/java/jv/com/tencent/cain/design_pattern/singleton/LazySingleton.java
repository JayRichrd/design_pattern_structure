package jv.com.tencent.cain.design_pattern.singleton;

/**
 * @author : jiangyu
 * @date : 2020/7/5
 * @desc : 单例设计模式-懒汉
 * 优点: 节省空间, 用到的时候再创建实例对象
 * 缺点: 线程不安全（添加synchronized来弥补）
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton instance = null;

    /**
     * 加上synchronized是为了线程安全
     * 但是加上synchronized后又会影响性能
     *
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
