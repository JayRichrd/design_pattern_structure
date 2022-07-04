package kt.com.tencent.cain.desigin_pattern.abstract_factory

/**
 * @author : jiangyu
 * @date   : 2020/3/20
 * @desc   : xxx
 */
interface IDepartment {
    /**
     * 插入数据
     */
    fun insertDepartment(department: Department)

    /**
     * 查询数据
     */
    fun queryDepartment(id: Int): Department
}