package kt.com.tencent.cain.desigin_pattern.abstract_factory

/**
 * @author : jiangyu
 * @date   : 2020/3/20
 * @desc   : xxx
 */
class AccessUser : IUser {
    override fun insertUser(user: User) {
        println("access# insert user: $user")
    }

    override fun queryUser(id: Int): User = User("Richard", 30)
}