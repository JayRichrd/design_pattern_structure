package jv.com.tencent.cain.design_pattern.strategy;

/**
 * @author : jiangyu
 * @date : 2019-03-30
 * @desc : 满减结算
 */
public class MoneyOffCashier extends AbstractCashier {
    // 满减条件金额
    private double moneyCondition = 1.0;
    // 达到满减金额后减去的金额
    private double moneyOff;

    public MoneyOffCashier() {
    }

    public MoneyOffCashier(double moneyCondition, double moneyOff) {
        this.moneyCondition = moneyCondition;
        this.moneyOff = moneyOff;
    }

    public double getMoneyCondition() {
        return moneyCondition;
    }

    public void setMoneyCondition(double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    public double getMoneyOff() {
        return moneyOff;
    }

    public void setMoneyOff(double moneyOff) {
        this.moneyOff = moneyOff;
    }

    /**
     * 结账
     *
     * @param totalPrice 商品总价
     * @return 返回真正需要支付的金额
     */
    @Override
    double onCash(double totalPrice) {
        System.out.println("moneyCondition: " + moneyCondition + ", moneyOff: " + moneyOff);
        double result = totalPrice;
        if (moneyCondition >= moneyOff && totalPrice >= moneyCondition) {
            result = totalPrice - ((int) (totalPrice / moneyCondition)) * moneyOff;
        } else {
            System.err.println("未达满减金额或者满减条件设置异常!");
        }
        return result;
    }
}
