package kt.com.tencent.cain.desigin_pattern.simple_factoty

/**
 * @author cainjiang
 * @date 2019-02-18
 * 简单设计模式
 */
fun main(args: Array<String>) {
    operation(1.0, 2.0, OperationFactoty.OperationType.OPERATION_ADD)
    operation(3.0, 4.0, OperationFactoty.OperationType.OPERATION_SUB)
    operation(5.0, 6.0, OperationFactoty.OperationType.OPERATION_MUL)
    operation(7.0, 8.0, OperationFactoty.OperationType.OPERATION_DIV)
}

fun operation(numA: Double, numB: Double, operationType: OperationFactoty.OperationType) {
    println()
    val operation = OperationFactoty.createOperation(operationType)
    operation.numA = numA
    operation.numB = numB
    println("${operationType.operationDes}：${operation.numA} ${operationType.operationType} ${operation.numB} = ${operation.getResult()}")
}