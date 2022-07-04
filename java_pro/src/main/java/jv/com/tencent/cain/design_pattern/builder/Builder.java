package jv.com.tencent.cain.design_pattern.builder;

/**
 * @author : jiangyu
 * @date : 2020/2/10
 * @desc : xxx
 */
public abstract class Builder {
    public abstract void buildPartA();

    public abstract void buildPartB();

    public abstract Product getResult();
}
