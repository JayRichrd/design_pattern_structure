package jv.com.tencent.cain.design_pattern.strategy;

/**
 * @author : jiangyu
 * @date : 2019-03-30
 * @desc : 结算上下文
 */
public class CashierContext {
    // 最终的结算策略
    private AbstractCashier cashier;

    // 结算策略
    public AbstractCashier.CashierStrategy cashierStrategy;
    //折扣
    public double discountRate;
    // 满减条件金额
    public double moneyConditon;
    // 达到满减金额后减去的金额
    public double moneyOff;

    /**
     * 结账
     *
     * @param totalPrice 商品总价
     * @return 返回真正需要支付的金额
     */
    public double onCash(double totalPrice) {
        return cashier.onCash(totalPrice);
    }

    /**
     * 构建具体的结算策略
     * {@link AbstractCashier.CashierStrategy}
     */
    private void action() {
        System.out.println("cashierStategy: " + cashierStrategy.strategyType);
        switch (cashierStrategy) {
            case CASHIER_DISCOUNT:
                cashier = new DiscountCashier(discountRate);
                break;
            case CASHIER_MONEY_OFF:
                cashier = new MoneyOffCashier(moneyConditon, moneyOff);
                break;
        }
    }

    static class Builder {
        private AbstractCashier.CashierStrategy cashierStrategy;
        private double discountRate;
        private double moneyConditon;
        private double moneyOff;

        public CashierContext build() {
            CashierContext cashierContext = new CashierContext();
            cashierContext.cashierStrategy = this.cashierStrategy;
            cashierContext.discountRate = this.discountRate;
            cashierContext.moneyConditon = this.moneyConditon;
            cashierContext.moneyOff = this.moneyOff;
            cashierContext.action();
            return cashierContext;
        }

        public Builder setDiscountRate(double discountRate) {
            this.discountRate = discountRate;
            return this;
        }

        public Builder setMoneyConditon(double moneyConditon) {
            this.moneyConditon = moneyConditon;
            return this;
        }

        public Builder setMoneyOff(double moneyOff) {
            this.moneyOff = moneyOff;
            return this;
        }

        public Builder setCashierStrategy(AbstractCashier.CashierStrategy cashierStrategy) {
            this.cashierStrategy = cashierStrategy;
            return this;
        }
    }
}
