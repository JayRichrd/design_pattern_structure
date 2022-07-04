package jv.com.tencent.cain.design_pattern.bridge;

/**
 * @author : jiangyu
 * @date : 2020/7/11
 * @desc : 桥接设计模式
 */
public class BridgePattern {
    public static void main(String[] args) {
        HandsetSoft map3 = new HandsetSoftMp3("Mp3播放器");
        HandsetBrandNokia nokia = new HandsetBrandNokia("Nokia");
        nokia.setSoft(map3);
        nokia.run();
        System.out.println("\n");
        HandsetSoft contact = new HandsetSoftContact("通讯录");
        HandsetBrandSamSung samSung = new HandsetBrandSamSung("SamSung");
        samSung.setSoft(contact);
        samSung.run();
    }
}
