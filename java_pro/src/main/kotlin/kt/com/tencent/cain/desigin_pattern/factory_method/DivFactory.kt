package kt.com.tencent.cain.desigin_pattern.factory_method

import kt.com.tencent.cain.desigin_pattern.simple_factoty.AddOperation
import kt.com.tencent.cain.desigin_pattern.simple_factoty.DivOperation
import kt.com.tencent.cain.desigin_pattern.simple_factoty.Operation

/**
 * @author cainjiang
 * @date 2019-05-21
 */
class DivFactory : IOperationFactory {
    override fun createOpration(): Operation {
        val divOperation = DivOperation()
        divOperation.operationSymbol = "/"
        divOperation.operationName = "除法"
        return divOperation
    }
}