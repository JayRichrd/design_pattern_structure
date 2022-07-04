package jv.com.tencent.cain.design_pattern.bridge;

/**
 * @author : jiangyu
 * @date : 2020/7/11
 * @desc : 桥接设计模式-剥离出来的一个分支
 **/
abstract public class HandsetBrand {
    protected HandsetSoft soft;
    protected String brand;

    public HandsetBrand(String brand) {
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    abstract void run();
}
