package jv.com.tencent.cain.design_pattern.singleton;

/**
 * @author : jiangyu
 * @date : 2020/7/5
 * @desc : 单例设计模式-通过ThreadLocal实现
 */
public class ThreadLocalSingleton {
    private static ThreadLocal perThreadInstance = new ThreadLocal();
    private static ThreadLocalSingleton instance = null;

    public static ThreadLocalSingleton getInstance() {
        /**
         * 如果 perThreadInstance.get() 返回一个非空值, 说明当前线程已经被同步了。
         * 它要看到instance变量的初始化
         **/
        if (perThreadInstance.get() == null) {
            createInstance();
        }
        return instance;
    }

    private static final void createInstance() {
        synchronized (ThreadLocalSingleton.class) {
            if (instance == null) {
                instance = new ThreadLocalSingleton();
            }
        }
        // 任何非空的值都可以作为这里的参数
        perThreadInstance.set(perThreadInstance);
    }

    /**
     * 阿里代码规范提示: ThreadLocal变量应该至少调用一次remove()方法, 原因如下:
     * 必须回收自定义的ThreadLocal变量, 尤其在线程池场景下, 因为线程经常会被复用,
     * 如果不清理自定义的 ThreadLocal变量, 可能会影响后续业务逻辑和造成内存泄露等问题.
     * 尽量在代理中使用try-finally块进行回收.
     */
    public static void remove() {
        perThreadInstance.remove();
    }
}
