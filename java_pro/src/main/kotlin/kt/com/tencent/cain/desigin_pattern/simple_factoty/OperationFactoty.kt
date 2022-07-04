package kt.com.tencent.cain.desigin_pattern.simple_factoty

/**
 * @author cainjiang
 * @date 2019-02-22
 * 构建操作类的工厂
 */

class OperationFactoty {
    /**
     * 操作类型
     */
    enum class OperationType(val operationType: String, val operationDes: String) {
        OPERATION_ADD("+", "加法"),
        OPERATION_SUB("-", "减法"),
        OPERATION_MUL("*", "乘法"),
        OPERATION_DIV("/", "除法")
    }

    companion object {
        /**
         * 创建并返回具体的操作类
         */
        fun createOperation(operationType: OperationType): Operation = when (operationType) {
            OperationType.OPERATION_ADD -> AddOperation()
            OperationType.OPERATION_SUB -> SubOperation()
            OperationType.OPERATION_MUL -> MulOperation()
            OperationType.OPERATION_DIV -> DivOperation()
        }
    }

}