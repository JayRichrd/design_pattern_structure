package kt.com.tencent.cain.desigin_pattern.factory_method

import kt.com.tencent.cain.desigin_pattern.simple_factoty.Operation

/**
 * @author cainjiang
 * @date 2019-05-21
 */
interface IOperationFactory {
    fun createOpration(): Operation
}