package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : xxx
 */
public class SqlserverUser implements IUser {

    @Override
    public void insertUser(User user) {
        System.out.println("sqlserver# insert user: " + user.toString());
    }

    @Override
    public User queryUser(int id) {
        return new User("cain", 28);
    }
}
