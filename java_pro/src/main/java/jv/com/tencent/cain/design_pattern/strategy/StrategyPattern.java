package jv.com.tencent.cain.design_pattern.strategy;

/**
 * @author : jiangyu
 * @date : 2019-03-30
 * @desc : 策略设计模式
 */
public class StrategyPattern {
    public static void main(String[] args) {
        double totalPrice = 1000.0;
        double discountRate = 0.8;
        double moneyCondition = 300.0;
        double moneyOff = 50.0;
        double result;

        CashierContext discountCashierContext = new CashierContext.Builder().
                setCashierStrategy(AbstractCashier.CashierStrategy.CASHIER_DISCOUNT).
                setDiscountRate(discountRate).
                build();
        result = discountCashierContext.onCash(totalPrice);
        System.out.println("discount result: " + result);

        CashierContext moneyOffCashierContext = new CashierContext.Builder().
                setCashierStrategy(AbstractCashier.CashierStrategy.CASHIER_MONEY_OFF).
                setMoneyConditon(moneyCondition).
                setMoneyOff(moneyOff).
                build();
        result = moneyOffCashierContext.onCash(totalPrice);
        System.out.println("moneyOff result: " + result);
    }
}
