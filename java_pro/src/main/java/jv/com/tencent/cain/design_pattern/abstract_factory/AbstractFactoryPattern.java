package jv.com.tencent.cain.design_pattern.abstract_factory;

/**
 * @author : jiangyu
 * @date : 2020/3/20
 * @desc : 抽象工厂设计模式
 */
public class AbstractFactoryPattern {
    public static void main(String[] args) {
        User user = new User("姜瑜", 29);
        Department department = new Department("IEG", 20000);

        IUser userSqlserverOp = DataAccessFactory.createUserOp(DataAccessFactory.DB_TYPE_SQL_SERVER);
        userSqlserverOp.insertUser(user);
        System.out.println("query user from sqlserver: " + userSqlserverOp.queryUser(1).toString());
        IUser userAccessOp = DataAccessFactory.createUserOp(DataAccessFactory.DB_TYPE_ACCESS);
        userAccessOp.insertUser(user);
        System.out.println("query user from access: " + userAccessOp.queryUser(2).toString());

        IDepartment departmentSqlserverOp = DataAccessFactory.createDepartmentOp(DataAccessFactory.DB_TYPE_SQL_SERVER);
        departmentSqlserverOp.insertDepartment(department);
        System.out.println("query department from sqlserver: " + departmentSqlserverOp.queryDepartment(1).toString());
        IDepartment departmentAccessOp = DataAccessFactory.createDepartmentOp(DataAccessFactory.DB_TYPE_ACCESS);
        departmentAccessOp.insertDepartment(department);
        System.out.println("query department from access: " + departmentAccessOp.queryDepartment(2));
    }
}
