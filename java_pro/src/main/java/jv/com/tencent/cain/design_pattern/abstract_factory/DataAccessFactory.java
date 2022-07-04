package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : 工厂类
 */
public class DataAccessFactory {
    /**
     * 数据库类型
     */
    public static final String DB_TYPE_SQL_SERVER = "Sqlserver";
    public static final String DB_TYPE_ACCESS = "Access";

    /**
     * 创建用户的数据库操作
     */
    public static IUser createUserOp(String dbType) {
        IUser userOp = null;
        switch (dbType) {
            case DB_TYPE_SQL_SERVER:
                userOp = new SqlserverUser();
                break;
            case DB_TYPE_ACCESS:
                userOp = new AccessUser();
                break;
        }
        return userOp;
    }

    /**
     * 创建部门的数据库操作
     *
     * @param dbType
     * @return
     */
    public static IDepartment createDepartmentOp(String dbType) {
        IDepartment departmentOp = null;
        switch (dbType) {
            case DB_TYPE_SQL_SERVER:
                departmentOp = new SqlserverDepartment();
                break;
            case DB_TYPE_ACCESS:
                departmentOp = new AccessDepartment();
                break;
        }
        return departmentOp;
    }
}
