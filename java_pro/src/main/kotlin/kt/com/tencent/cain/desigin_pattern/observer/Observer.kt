package kt.com.tencent.cain.desigin_pattern.observer

/**
 * @author : jiangyu
 * @date   : 2020/3/3
 * @desc   : xxx
 */
interface Observer {
    /**
     * 更新状态
     */
    fun update(subject: Subject, data: Any)
}