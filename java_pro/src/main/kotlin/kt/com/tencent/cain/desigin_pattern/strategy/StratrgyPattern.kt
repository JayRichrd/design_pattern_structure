package kt.com.tencent.cain.desigin_pattern.strategy

/**
 * @author : jiangyu
 * @date   : 2019-03-30
 * @strategyType   : xxx
 */
fun main() {
    val totalPrice = 1200.0
    val discountRate = 0.78
    val moneyCondition = 350.0
    val moneyOff = 45.0

    val discountCashierContext = CashierContext.Builder().
        cashierStrategy(AbstractCashier.CashierStrategy.CASHIER_DISCOUNT).
        discountRate(discountRate).
        build()
    println("result: ${discountCashierContext.onCash(totalPrice)}")

    val moneyOffCashierContext = CashierContext.Builder().
        cashierStrategy(AbstractCashier.CashierStrategy.CASHIER_MONEY_OFF).
        moneyCondition(moneyCondition).
        moneyOff(moneyOff).
        build()
    println("result: ${moneyOffCashierContext.onCash(totalPrice)}")
}