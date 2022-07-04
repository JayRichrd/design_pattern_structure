package kt.com.tencent.cain.desigin_pattern.simple_factoty

/**
 * @author cainjiang
 * @date 2019-02-22
 * 乘法操作类
 */
class MulOperation : Operation() {
    override fun getResult(): Double {
        return numA * numB
    }
}