package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : xxx
 */
public class Department {
    /**
     * 部门名字
     */
    private String departmentName;
    /**
     * 部门人数
     */
    private int count;

    public Department() {
    }

    public Department(String departmentName, int count) {
        this.departmentName = departmentName;
        this.count = count;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentName='" + departmentName + '\'' +
                ", count=" + count +
                '}';
    }
}
