package kt.com.tencent.cain.desigin_pattern.abstract_factory

/**
 * @author : jiangyu
 * @date   : 2020/3/20
 * @desc   : 抽象工厂设计模式
 */
fun main() {
    val user = User("Jay", 31)
    val department = Department("IEG", 20000)

    val sqlserverUserOp = DataAccessFactory.createUserOp(DataAccessFactory.DB_TYPE_SQL_SERVER)
    sqlserverUserOp?.insertUser(user)
    println("query user from sqlserver: ${sqlserverUserOp?.queryUser(1).toString()}")
    val sqlserverDepartmentOp = DataAccessFactory.createDepartmentOp(DataAccessFactory.DB_TYPE_SQL_SERVER)
    sqlserverDepartmentOp?.insertDepartment(department)
    println("query user from sqlserver: ${sqlserverDepartmentOp?.queryDepartment(1).toString()}")

    val accessUserOp = DataAccessFactory.createUserOp(DataAccessFactory.DB_TYPE_ACCESS)
    accessUserOp?.insertUser(user)
    println("query user from sqlserver: ${accessUserOp?.queryUser(2).toString()}")
    val accessDepartmentOp = DataAccessFactory.createDepartmentOp(DataAccessFactory.DB_TYPE_ACCESS)
    accessDepartmentOp?.insertDepartment(department)
    println("query user from sqlserver: ${accessDepartmentOp?.queryDepartment(2).toString()}")


}