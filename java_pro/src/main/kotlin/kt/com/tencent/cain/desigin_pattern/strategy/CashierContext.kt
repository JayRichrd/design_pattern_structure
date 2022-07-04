package kt.com.tencent.cain.desigin_pattern.strategy

/**
 * @author : jiangyu
 * @date   : 2019-03-30
 * @strategyType   : xxx
 * @param cashierStrategy 结束啦策略
 * @param discountRate 折扣
 * @param moneyCondition 满减条件金额
 * @param moneyOff 达到满减金额后减去的金额
 */
class CashierContext(
    var cashierStrategy: AbstractCashier.CashierStrategy = AbstractCashier.CashierStrategy.CASHIER_DISCOUNT,
    var discountRate: Double = 1.0,
    var moneyCondition: Double = 1.0,
    var moneyOff: Double = 0.0) {

    private var cashier: AbstractCashier = DiscountCashier()

    fun onCash(totalPrice: Double) = cashier.onCash(totalPrice)

    private fun action(): CashierContext = when (cashierStrategy) {
        AbstractCashier.CashierStrategy.CASHIER_DISCOUNT -> {
            cashier = DiscountCashier(discountRate)
            println(cashierStrategy.strategyType)
            this
        }
        AbstractCashier.CashierStrategy.CASHIER_MONEY_OFF -> {
            cashier = MoneyOffCashier(moneyCondition, moneyOff)
            println(cashierStrategy.strategyType)
            this
        }
    }


    class Builder {
        private var cashierStrategy: AbstractCashier.CashierStrategy = AbstractCashier.CashierStrategy.CASHIER_DISCOUNT
        private var discountRate: Double = 1.0
        private var moneyCondition: Double = 1.0
        private var moneyOff: Double = 0.0

        fun cashierStrategy(cashierStrategy: AbstractCashier.CashierStrategy) =
            apply { this.cashierStrategy = cashierStrategy }

        fun discountRate(discountRate: Double) = apply { this.discountRate = discountRate }
        fun moneyCondition(moneyCondition: Double) = apply { this.moneyCondition = moneyCondition }
        fun moneyOff(moneyOff: Double) = apply { this.moneyOff = moneyOff }

        fun build(): CashierContext = CashierContext(
            cashierStrategy = cashierStrategy,
            discountRate = discountRate,
            moneyCondition = moneyCondition,
            moneyOff = moneyOff
        ).action()

    }
}