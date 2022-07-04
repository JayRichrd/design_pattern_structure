package kt.com.tencent.cain.desigin_pattern.strategy

/**
 * @author : jiangyu
 * @date   : 2019-03-30
 * @strategyType   : xxx
 * @param moneyCondition 满减条件金额
 * @param moneyOff 达到满减金额后减去的金额
 */
class MoneyOffCashier(private val moneyCondition: Double = 1.0, private val moneyOff: Double = 0.0) : AbstractCashier() {

    /**
     * 结账
     *
     * @param totalPrice 商品总价
     * @return 返回真正需要支付的金额
     */
    override fun onCash(totalPrice: Double): Double {
        println("totalPrice: $totalPrice, moneyConditon: $moneyCondition, moneyOff: $moneyOff")
        val result: Double
        if (totalPrice >= moneyCondition && moneyCondition >= moneyOff) {
            result = totalPrice - (totalPrice / moneyCondition).toInt() * moneyOff
        } else {
            error("消费金额未达满减或者满减规则设置异常!")
        }
        return result
    }
}