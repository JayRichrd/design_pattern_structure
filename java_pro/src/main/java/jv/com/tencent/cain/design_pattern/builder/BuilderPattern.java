package jv.com.tencent.cain.design_pattern.builder;

/**
 * @author : jiangyu
 * @date : 2020/2/10
 * @desc : 构建者设计模式
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        System.out.println();

        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
