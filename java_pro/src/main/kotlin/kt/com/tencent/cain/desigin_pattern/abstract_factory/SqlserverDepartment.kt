package kt.com.tencent.cain.desigin_pattern.abstract_factory

/**
 * @author : jiangyu
 * @date   : 2020/3/20
 * @desc   : xxx
 */
class SqlserverDepartment : IDepartment {
    override fun insertDepartment(department: Department) {
        println("sqlserver# insert department: $department")
    }

    override fun queryDepartment(id: Int): Department = Department("IOS", 10)
}