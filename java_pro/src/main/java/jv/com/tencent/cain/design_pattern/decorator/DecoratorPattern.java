package jv.com.tencent.cain.design_pattern.decorator;

/**
 * @author cainjiang
 * @date 2019-03-31
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Person person = new Person("程序员");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();
        // 不断进行装饰
        tShirts.decorate(person);
        bigTrouser.decorate(tShirts);
        bigTrouser.show();
    }
}
