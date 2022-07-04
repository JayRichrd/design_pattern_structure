package jv.com.tencent.cain.design_pattern.adapter;

/**
 * @author cainjiang
 * @date 2020/4/15
 */
public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

    public abstract void defense();
}
