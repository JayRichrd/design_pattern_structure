package jv.com.tencent.cain.design_pattern.fly_weight;

/**
 * @author cainjiang
 * @date 2020/8/14
 */
public class FlyWeightPattern {
    public static void main(String[] args) {
        int externalState = 10;
        FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
        AbstractFlyWeight flyWeightX = flyWeightFactory.getFlyWeight("x");
        if (flyWeightX != null) {
            flyWeightX.operation(externalState);
        }

        AbstractFlyWeight flyWeightY = flyWeightFactory.getFlyWeight("y");
        if (flyWeightY != null) {
            flyWeightY.operation(--externalState);
        }

        AbstractFlyWeight flyWeightZ = flyWeightFactory.getFlyWeight("z");
        if (flyWeightZ != null) {
            flyWeightZ.operation(--externalState);
        }

        AbstractFlyWeight unSharedflyWeight = flyWeightFactory.getUnSharedFlyWeight();
        if (unSharedflyWeight != null) {
            unSharedflyWeight.operation(--externalState);
        }

        AbstractFlyWeight flyWeightZ1 = flyWeightFactory.getFlyWeight("z");
        if (flyWeightZ1 != null) {
            flyWeightZ1.operation(--externalState);
        }

        System.out.println("count: " + flyWeightFactory.getFlyWeightCount());

    }
}
