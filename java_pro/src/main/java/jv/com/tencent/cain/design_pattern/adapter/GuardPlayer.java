package jv.com.tencent.cain.design_pattern.adapter;

/**
 * @author cainjiang
 * @date 2020/4/15
 */
public class GuardPlayer extends Player {

    public GuardPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("GuardPlayer# " + name + " attack ---");
    }

    @Override
    public void defense() {
        System.out.println("GuardPlayer# " + name + " defense ---");
    }
}
