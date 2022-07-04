package kt.com.tencent.cain.desigin_pattern.chain_responsibility

/**
 * @author : jiangyu
 * @date   : 2020/8/8
 * @desc   : xxx
 */
abstract class Manager(protected var name: String = "") {
    var superior: Manager? = null
    abstract fun handleRequest(request: Request)
}