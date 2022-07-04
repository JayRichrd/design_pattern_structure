package kt.com.tencent.cain.desigin_pattern.chain_responsibility

/**
 * @author : jiangyu
 * @date   : 2020/8/8
 * @desc   : xxx
 */
data class Request(var requestType: Int = 0,
                   var requestContent: String = "",
                   var requestCount: Int = 0) {
    companion object {
        const val REQUEST_TYPE_VACATION = 1
        const val REQUEST_TYPE_RAISE_SALARY = 2
    }
}