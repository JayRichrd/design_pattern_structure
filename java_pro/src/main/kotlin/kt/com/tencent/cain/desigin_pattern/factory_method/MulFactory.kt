package kt.com.tencent.cain.desigin_pattern.factory_method

import kt.com.tencent.cain.desigin_pattern.simple_factoty.MulOperation
import kt.com.tencent.cain.desigin_pattern.simple_factoty.Operation

/**
 * @author cainjiang
 * @date 2019-05-21
 */
class MulFactory : IOperationFactory {
    override fun createOpration(): Operation {
        val mulOperation = MulOperation()
        mulOperation.operationSymbol = "*"
        mulOperation.operationName = "乘法"
        return mulOperation
    }
}