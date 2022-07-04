package kt.com.tencent.cain.desigin_pattern.bridge

/**
 * @author : jiangyu
 * @date   : 2020/7/11
 * @desc   : xxx
 */
class HandsetSoftMoviePlayer(softName: String) : HandsetSoft(softName) {
    override fun run() {
        println("运行$softName")
    }
}