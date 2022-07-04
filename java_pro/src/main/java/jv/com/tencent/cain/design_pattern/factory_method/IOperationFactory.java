package jv.com.tencent.cain.design_pattern.factory_method;


/**
 * @author cainjiang
 * @date 2019-05-20
 */
public interface IOperationFactory {
    /**
     * 创建具体的操作方法实例
     *
     * @return
     */
    public Operation createOpration();

}
