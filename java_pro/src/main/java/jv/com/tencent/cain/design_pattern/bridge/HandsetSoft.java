package jv.com.tencent.cain.design_pattern.bridge;

/**
 * @author : jiangyu
 * @date : 2020/7/11
 * @desc : 桥接设计模式-剥离出来的一个分支
 */
abstract public class HandsetSoft {
    protected String softName;

    public HandsetSoft(String name) {
        this.softName = name;
    }

    public void setSoftName(String softName) {
        this.softName = softName;
    }

    abstract void run();
}
