package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : xxx
 */
public interface IUser {
    /**
     * 插入数据
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 查询数据
     *
     * @param id
     * @return
     */
    User queryUser(int id);
}
