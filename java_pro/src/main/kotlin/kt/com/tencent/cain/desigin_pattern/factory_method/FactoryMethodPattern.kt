package kt.com.tencent.cain.desigin_pattern.factory_method

import kt.com.tencent.cain.desigin_pattern.simple_factoty.Operation

/**
 * @author cainjiang
 * @date 2019-05-21
 */

fun main(args: Array<String>) {
    operation(1.0, 2.0, AddFactory().createOpration())
    operation(3.0, 4.0, SubFactory().createOpration())
    operation(5.0, 6.0, MulFactory().createOpration())
    operation(7.0, 8.0, DivFactory().createOpration())
}

fun operation(numA: Double, numB: Double, operationObj: Operation) {
    println()
    operationObj.numA = numA
    operationObj.numB = numB
    println("${operationObj.operationName}：${operationObj.numA} ${operationObj.operationSymbol} ${operationObj.numB} = ${operationObj.getResult()}")
}