package jv.com.tencent.cain.design_pattern.builder;

/**
 * @author : jiangyu
 * @date : 2020/2/10
 * @desc : xxx
 */
public class Director {

    public void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
