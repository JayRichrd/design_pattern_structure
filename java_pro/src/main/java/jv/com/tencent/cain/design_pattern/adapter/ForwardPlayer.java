package jv.com.tencent.cain.design_pattern.adapter;

/**
 * @author cainjiang
 * @date 2020/4/15
 */
public class ForwardPlayer extends Player {

    public ForwardPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("ForwardPlayer# " + name + " attack ---");
    }

    @Override
    public void defense() {
        System.out.println("ForwardPlayer# " + name + " defense ---");
    }
}
