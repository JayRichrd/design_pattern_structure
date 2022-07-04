package kt.com.tencent.cain.desigin_pattern.bridge

/**
 * @author : jiangyu
 * @date   : 2020/7/11
 * @desc   : xxx
 */
fun main() {
    val moviePlayer = HandsetSoftMoviePlayer("视频播放器▶️")
    val xiaoMi = HandsetBrandXiaoMi("小米").apply { soft = moviePlayer }
    xiaoMi.run()
    val phone = HandsetSoftPhone("拨号")
    val huaWei = HandsetBrandHuaWei("HUAWEI").apply { soft = phone }
    huaWei.run()
}