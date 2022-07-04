package kt.com.tencent.cain.desigin_pattern.abstract_factory

/**
 * @author : jiangyu
 * @date   : 2020/3/20
 * @desc   : xxx
 */
class DataAccessFactory {
    companion object {
        const val DB_TYPE_SQL_SERVER = "Sqlserver"
        const val DB_TYPE_ACCESS = "Access"

        fun createUserOp(dbType: String): IUser? = when (dbType) {
            DB_TYPE_SQL_SERVER -> {
                SqlserverUser()
            }
            DB_TYPE_ACCESS -> {
                AccessUser()
            }
            else -> {
                null
            }
        }

        fun createDepartmentOp(dbType: String): IDepartment? = when (dbType) {
            DB_TYPE_SQL_SERVER -> {
                SqlserverDepartment()
            }
            DB_TYPE_ACCESS -> {
                AccessDepartment()
            }
            else -> {
                null
            }
        }
    }
}