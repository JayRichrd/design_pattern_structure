package jv.com.tencent.cain.design_pattern.proxy;

/**
 * @author cainjiang
 * @date 2019-05-17
 * RealSubject
 */
public class Pursuit implements IGiveGift {
    private SchoolGirl schoolGirl;

    public Pursuit(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }

    public Pursuit() {
    }

    @Override
    public void giveDolls() {
        String name = "";
        if (schoolGirl != null) {
            name = schoolGirl.getName();
        }
        System.out.println(name + "送你洋娃娃🤩");
    }

    @Override
    public void giveFlowers() {
        String name = "";
        if (schoolGirl != null) {
            name = schoolGirl.getName();
        }
        System.out.println(name + "送你鲜花💐");
    }

    @Override
    public void giveChocolate() {
        String name = "";
        if (schoolGirl != null) {
            name = schoolGirl.getName();
        }
        System.out.println(name + "巧克力🍫");

    }
}
