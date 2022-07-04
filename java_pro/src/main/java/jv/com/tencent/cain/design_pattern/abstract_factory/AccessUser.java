package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : xxx
 */
public class AccessUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("access# insert user: " + user);
    }

    @Override
    public User queryUser(int id) {
        return new User("Richard", 30);
    }
}
