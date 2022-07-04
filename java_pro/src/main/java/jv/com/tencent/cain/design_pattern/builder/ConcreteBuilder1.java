package jv.com.tencent.cain.design_pattern.builder;

/**
 * @author : jiangyu
 * @date : 2020/2/10
 * @desc : xxx
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("部件A");
    }

    @Override
    public void buildPartB() {
        product.addPart("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
