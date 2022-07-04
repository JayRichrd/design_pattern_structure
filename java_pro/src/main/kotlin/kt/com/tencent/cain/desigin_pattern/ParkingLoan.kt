package kt.com.tencent.cain.desigin_pattern

import kotlin.math.abs
import kotlin.math.pow

/**
 * @author : jiangyu
 * @date   : 2020/3/26
 * @desc   : 车位贷计算
 */
const val STEP: Double = 0.0001
const val LIMIT: Int = 10000
/**
 * 贷款总金额
 */
const val SUM: Double = 100000.0
/**
 * 每月相同的还款数
 */
const val REPAY_OF_MONTH: Double = 1941.0
/**
 * 贷款月数
 */
const val MONTH_NUM: Double = 60.0

fun main() {
    var rationOfMonth = 0.05
    /**
     * 最终的月利率
     */
    var finalRationOfMonth = rationOfMonth
    var curRepayOfMonth = algFunc(rationOfMonth)
    var firstDiff = abs(curRepayOfMonth - REPAY_OF_MONTH)
    var secondDiff = firstDiff
    var thirdDiff = secondDiff
    var count = 0
    println("第${count + 1}次：rationOfMonth = $rationOfMonth, curRepayOfMonth = $curRepayOfMonth, diff = $thirdDiff")
    /**
     * 函数趋势：先减后升，找到波谷那个值，就是我们想要的
     */
    while (!(firstDiff > secondDiff && secondDiff < thirdDiff) && count < LIMIT) {
        finalRationOfMonth = rationOfMonth
        rationOfMonth -= STEP
        count++
        curRepayOfMonth = algFunc(rationOfMonth)
        firstDiff = secondDiff
        secondDiff = thirdDiff
        thirdDiff = abs(curRepayOfMonth - REPAY_OF_MONTH)
        println("第${count + 1}次：rationOfMonth = $rationOfMonth, curRepayOfMonth = $curRepayOfMonth, diff = $thirdDiff")
    }
    println("rationOfMonth = $finalRationOfMonth, rationOfYear = ${finalRationOfMonth * 12.toDouble()}, exceed limit: ${count >= LIMIT}")
}

fun algFunc(rationOfMonth: Double): Double = (REPAY_OF_MONTH - SUM * rationOfMonth) * (1.toDouble() + rationOfMonth).pow(MONTH_NUM)
