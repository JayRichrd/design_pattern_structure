package jv.com.tencent.cain.design_pattern.adapter;

/**
 * @author cainjiang
 * @date 2020/4/15
 * @desc 适配器模式
 * 适配层
 */
public class TranslateAdapter extends Player {

    private ForeignCenterPlayer centerPlayer;

    public ForeignCenterPlayer getCenterPlayer() {
        return centerPlayer;
    }

    public void setCenterPlayer(ForeignCenterPlayer centerPlayer) {
        this.centerPlayer = centerPlayer;
    }

    public TranslateAdapter(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("TranslateAdapter# " + centerPlayer.getName() + " attack ---");
        centerPlayer.jingong();
    }

    @Override
    public void defense() {
        System.out.println("TranslateAdapter# " + centerPlayer.getName() + " defense ---");
        centerPlayer.fangshou();
    }
}
