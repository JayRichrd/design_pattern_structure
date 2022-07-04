package jv.com.tencent.cain.design_pattern.adapter;

/**
 * @author cainjiang
 * @date 2020/4/15
 */
public class ForeignCenterPlayer {
    private String name;

    public ForeignCenterPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jingong() {
        System.out.println("ForeignCenterPlayer# " + name + " 进攻 ---");
    }

    public void fangshou() {
        System.out.println("ForeignCenterPlayer# " + name + " 防守 ---");
    }

}
