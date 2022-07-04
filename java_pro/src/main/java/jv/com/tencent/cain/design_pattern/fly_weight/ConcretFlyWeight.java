package jv.com.tencent.cain.design_pattern.fly_weight;

/**
 * @author cainjiang
 * @date 2020/8/14
 */
public class ConcretFlyWeight extends AbstractFlyWeight {

    @Override
    void operation(int externalState) {
        System.out.println("具体FlyWeight, 外部状态: " + externalState);
    }
}
