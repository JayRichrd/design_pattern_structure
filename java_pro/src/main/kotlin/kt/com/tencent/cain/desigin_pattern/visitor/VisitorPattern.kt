package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
fun main() {
    val objStruct = ObjStruct()
    val elementC = ConcrectElementC()
    val elementD = ConcrectElementD()
    val visitorOne = ConcrectVisitorOne()
    val visitorTwo = ConcrectVisitorTwo()
    objStruct.attachElement(elementC)
    objStruct.attachElement(elementD)
    objStruct.visitor(visitorOne)
    objStruct.visitor(visitorTwo)
}