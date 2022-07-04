package jv.com.tencent.cain.design_pattern.visitor;

/**
 * @author : jiangyu
 * @date : 2020/8/22
 * @desc : xxx
 */
public enum ElementType {
    // 男人
    MALE("男", "男性群体"),
    // 女人
    FMALE("女", "女性群体");

    public String name;
    public String desc;

    ElementType(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
}
