package kt.com.tencent.cain.desigin_pattern.abstract_factory

/**
 * @author : jiangyu
 * @date   : 2020/3/20
 * @desc   : xxx
 */
class SqlserverUser : IUser {

    override fun insertUser(user: User) {
        println("sqlserver# insert user: $user")
    }

    override fun queryUser(id: Int): User = User("cain", 30)
}