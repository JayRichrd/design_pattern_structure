package kt.com.tencent.cain.desigin_pattern.simple_factoty

/**
 * @author cainjiang
 * @date 2019-02-22
 * 除法操作类
 */
class DivOperation : Operation() {
    override fun getResult(): Double {
        if (numB == 0.0) {
            throw IllegalArgumentException("除数不能为0!")
        } else {
            return numA / numB
        }
    }
}