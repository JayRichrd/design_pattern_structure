package kt.com.tencent.cain.desigin_pattern.chain_responsibility

/**
 * @author : jiangyu
 * @date   : 2020/8/8
 * @desc   : xxx
 */
class CommonManager(name: String) : Manager(name) {

    override fun handleRequest(request: Request) {
        if (request.requestType == Request.REQUEST_TYPE_VACATION && request.requestCount <= 3) {
            println("${request.requestContent}, ${request.requestCount}, ${name}已批准")
            return
        }
        superior?.handleRequest(request)
    }
}