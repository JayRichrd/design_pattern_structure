package kt.com.tencent.cain.desigin_pattern.factory_method

import kt.com.tencent.cain.desigin_pattern.simple_factoty.AddOperation
import kt.com.tencent.cain.desigin_pattern.simple_factoty.Operation

/**
 * @author cainjiang
 * @date 2019-05-21
 */
class AddFactory : IOperationFactory {
    override fun createOpration(): Operation {
        val addOperation = AddOperation()
        addOperation.operationSymbol = "+"
        addOperation.operationName = "加法"
        return addOperation
    }
}