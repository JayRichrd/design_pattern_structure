package jv.com.tencent.cain.design_pattern.facade;

/**
 * @author : jiangyu
 * @date : 2020/2/5
 * @desc : xxx
 */
public class FacadeSystem {
    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public FacadeSystem() {
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();
    }

    public void methodA() {
        System.out.println("---方法组A---");
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
        System.out.println();
    }

    public void methodB() {
        System.out.println("---方法组B---");
        subSystemOne.methodOne();
        subSystemThree.methodThree();
        System.out.println();
    }

    public void methodC() {
        System.out.println("---方法组C---");
        subSystemTwo.methodTwo();
        subSystemThree.methodThree();
        System.out.println();
    }
}
