package kt.com.tencent.cain.desigin_pattern.factory_method

import kt.com.tencent.cain.desigin_pattern.simple_factoty.Operation
import kt.com.tencent.cain.desigin_pattern.simple_factoty.SubOperation

/**
 * @author cainjiang
 * @date 2019-05-21
 */
class SubFactory : IOperationFactory {
    override fun createOpration(): Operation {
        val subOperation = SubOperation()
        subOperation.operationSymbol = "-"
        subOperation.operationName = "减法"
        return subOperation
    }
}