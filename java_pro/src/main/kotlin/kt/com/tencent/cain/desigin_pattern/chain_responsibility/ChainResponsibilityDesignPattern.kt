package kt.com.tencent.cain.desigin_pattern.chain_responsibility

import kt.com.tencent.cain.desigin_pattern.chain_responsibility.Request.Companion.REQUEST_TYPE_RAISE_SALARY
import kt.com.tencent.cain.desigin_pattern.chain_responsibility.Request.Companion.REQUEST_TYPE_VACATION

/**
 * @author : jiangyu
 * @date   : 2020/8/8
 * @desc   : xxx
 */
fun main() {
    val boss: Manager = BossManager("总经理")
    val majorManager: Manager = MajorManager("副经理")
    majorManager.superior = boss
    val commonManager: Manager = CommonManager("总监")
    commonManager.superior = majorManager

    val request1 = Request(REQUEST_TYPE_VACATION, "请假", 3)
    val request2 = Request(REQUEST_TYPE_RAISE_SALARY, "涨薪", 2000)
    commonManager.handleRequest(request1)
    commonManager.handleRequest(request2)
}