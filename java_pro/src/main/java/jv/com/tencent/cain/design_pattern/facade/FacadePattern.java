package jv.com.tencent.cain.design_pattern.facade;

/**
 * @author : jiangyu
 * @date : 2020/2/5
 * @desc : 外观设计模式
 */
public class FacadePattern {
    public static void main(String[] args) {
        FacadeSystem facadeSystem = new FacadeSystem();
        facadeSystem.methodA();
        facadeSystem.methodB();
        facadeSystem.methodC();
    }
}
