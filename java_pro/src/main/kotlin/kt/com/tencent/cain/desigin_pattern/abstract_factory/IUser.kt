package kt.com.tencent.cain.desigin_pattern.abstract_factory

/**
 * @author : jiangyu
 * @date   : 2020/3/20
 * @desc   : xxx
 */
interface IUser {
    /**
     * 插入数据
     */
    fun insertUser(user: User)

    /**
     * 查询数据
     */
    fun queryUser(id: Int): User
}