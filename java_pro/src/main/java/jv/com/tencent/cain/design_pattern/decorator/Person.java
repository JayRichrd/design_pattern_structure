package jv.com.tencent.cain.design_pattern.decorator;

/**
 * @author cainjiang
 * @date 2019-03-31
 * 被装饰者
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void show() {
        System.out.println("装扮的" + name);
    }
}
