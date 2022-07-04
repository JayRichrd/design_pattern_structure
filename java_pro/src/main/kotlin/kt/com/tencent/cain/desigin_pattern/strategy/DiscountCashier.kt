package kt.com.tencent.cain.desigin_pattern.strategy

/**
 * @author : jiangyu
 * @date   : 2019-03-30
 * @strategyType   : xxx
 * @param discountRate 折扣
 */
class DiscountCashier(private val discountRate: Double = 1.0) : AbstractCashier() {

    /**
     * 结账
     *
     * @param totalPrice 商品总价
     * @return 返回真正需要支付的金额
     */
    override fun onCash(totalPrice: Double): Double {
        println("totalPrice: $totalPrice, discountRate: $discountRate")
        return totalPrice * discountRate
    }
}