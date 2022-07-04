package kt.com.tencent.cain.desigin_pattern.state

/**
 * @author : jiangyu
 * @date   : 2020/3/28
 * @desc   : xxx
 */
data class Work(var curTimeHour: Int = 9,
                var isFinished: Boolean = false,
                var state: State = BeforeNoonState()) {
    fun doWork() {
        state.doWork(this)
    }
}