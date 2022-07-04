package jv.com.tencent.cain.design_pattern.bridge;

/**
 * @author : jiangyu
 * @date : 2020/7/11
 * @desc : xxx
 */
public class HandsetSoftMp3 extends HandsetSoft {
    public HandsetSoftMp3(String softName) {
        super(softName);
    }

    @Override
    void run() {
        System.out.println("运行" + softName);
    }
}
