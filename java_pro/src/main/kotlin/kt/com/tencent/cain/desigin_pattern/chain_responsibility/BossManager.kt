package kt.com.tencent.cain.desigin_pattern.chain_responsibility

import kt.com.tencent.cain.desigin_pattern.chain_responsibility.Request.Companion.REQUEST_TYPE_RAISE_SALARY
import kt.com.tencent.cain.desigin_pattern.chain_responsibility.Request.Companion.REQUEST_TYPE_VACATION

/**
 * @author : jiangyu
 * @date   : 2020/8/8
 * @desc   : xxx
 */
class BossManager(name: String) : Manager(name) {

    override fun handleRequest(request: Request) {
        when (request.requestType) {
            REQUEST_TYPE_VACATION -> {
                when {
                    request.requestCount <= 7 -> {
                        println("${request.requestContent}, ${request.requestCount}, ${name}已批准")
                    }
                    else -> {
                        println("${request.requestContent}, ${request.requestCount}, ${name}已拒绝")

                    }
                }
            }
            REQUEST_TYPE_RAISE_SALARY -> {
                when {
                    request.requestCount <= 1500 -> {
                        println("${request.requestContent}, ${request.requestCount}, ${name}已批准")
                    }
                    else -> {
                        println("${request.requestContent}, ${request.requestCount}, ${name}已拒绝")
                    }
                }
            }
        }
    }
}