package jv.com.tencent.cain.design_pattern.proxy;

/**
 * @author cainjiang
 * @date 2019-05-17
 */
public class SchoolGirl {

    /**
     * 姓名
     */
    private String name;

    public SchoolGirl() {
    }

    public SchoolGirl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
