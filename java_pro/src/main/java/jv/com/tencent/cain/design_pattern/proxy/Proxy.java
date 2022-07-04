package jv.com.tencent.cain.design_pattern.proxy;

/**
 * @author cainjiang
 * @date 2019-05-17
 * 代理者
 */
public class Proxy implements IGiveGift {
    Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl) {
        if (pursuit == null) {
            pursuit = new Pursuit(schoolGirl);
        }
    }

    public Proxy() {
        if (pursuit == null) {
            pursuit = new Pursuit();
        }
    }


    @Override
    public void giveDolls() {
        if (pursuit != null) {
            pursuit.giveDolls();
        } else {
            System.out.println("null error!");
        }
    }

    @Override
    public void giveFlowers() {
        if (pursuit != null) {
            pursuit.giveFlowers();
        } else {
            System.out.println("null error!");
        }
    }

    @Override
    public void giveChocolate() {
        if (pursuit != null) {
            pursuit.giveChocolate();
        } else {
            System.out.println("null error!");
        }
    }
}
