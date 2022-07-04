package jv.com.tencent.cain.design_pattern.proxy;

/**
 * @author : jiangyu
 * @date : 2019-05-18
 * @desc : 代理设计模式
 */
public class ProxyPattern {
    public static void main(String[] args) {
        SchoolGirl schoolGirl = new SchoolGirl("Lily");
        Proxy giveGiftProxy = new Proxy(schoolGirl);
        giveGiftProxy.giveDolls();
        giveGiftProxy.giveFlowers();
        giveGiftProxy.giveChocolate();
    }

}
