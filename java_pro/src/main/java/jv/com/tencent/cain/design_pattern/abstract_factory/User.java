package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : xxx
 */
public class User {
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
