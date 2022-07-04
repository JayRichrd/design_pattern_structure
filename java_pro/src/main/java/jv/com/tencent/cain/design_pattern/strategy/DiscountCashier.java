package jv.com.tencent.cain.design_pattern.strategy;

/**
 * @author : jiangyu
 * @date : 2019-03-30
 * @desc : 打折结算
 */
public class DiscountCashier extends AbstractCashier {
    private static final int DEFAULT_DISCOUNT_RATE = 1;
    // 折扣
    private double discountRate = DEFAULT_DISCOUNT_RATE;

    public DiscountCashier() {
    }

    public DiscountCashier(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * 结账
     *
     * @param totalPrice 商品总价
     * @return 返回真正需要支付的金额
     */
    @Override
    double onCash(double totalPrice) {
        System.out.println("discountRate: " + discountRate + ", totalPrice: " + totalPrice);
        return totalPrice * discountRate;
    }
}
