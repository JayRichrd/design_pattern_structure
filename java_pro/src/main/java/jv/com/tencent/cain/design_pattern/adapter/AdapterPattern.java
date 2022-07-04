package jv.com.tencent.cain.design_pattern.adapter;

/**
 * @author cainjiang
 * @date 2020/4/15
 */
public class AdapterPattern {

    public static void main(String[] args) {
        Player forwardPlayer = new ForwardPlayer("Battier");
        Player guardPlayer = new GuardPlayer("McGrady");
        TranslateAdapter centerPlayer = new TranslateAdapter("Translator");
        centerPlayer.setCenterPlayer(new ForeignCenterPlayer("Yao Ming"));
        System.out.println("---start play---");
        forwardPlayer.attack();
        guardPlayer.defense();
        centerPlayer.attack();
    }
}
