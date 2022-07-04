package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : xxx
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insertDepartment(Department department) {
        System.out.println("access# insert department: " + department);
    }

    @Override
    public Department queryDepartment(int id) {
        return new Department("IOS", 10);
    }
}
