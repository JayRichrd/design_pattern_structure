package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : xxx
 */
public interface IDepartment {
    /**
     * 插入数据
     * @param department
     */
    void insertDepartment(Department department);

    /**
     * 查询数据
     * @param id
     * @return
     */
    Department queryDepartment(int id);
}
