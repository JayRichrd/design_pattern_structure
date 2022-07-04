package jv.com.tencent.cain.design_pattern.simple_factory;

/**
 * @author cainjiang
 * @date 2019-02-21
 * 操作的基类
 */
abstract public class Operation {
    /**
     * 操作数a
     */
    public double numA;
    /**
     * 操作数b
     */
    public double numB;
    /**
     * 运算符号
     */
    public String operationSymbol;
    /**
     * 运算名
     */
    public String operationName;

    public double getNumA() {
        return numA;
    }

    public double getNumB() {
        return numB;
    }

    /**
     * 获取操作结果
     *
     * @return
     */
    public abstract double getResult();
}
