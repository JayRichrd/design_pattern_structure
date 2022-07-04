package kt.com.tencent.cain.desigin_pattern.bridge

/**
 * @author : jiangyu
 * @date   : 2020/7/11
 * @desc   : xxx
 */
class HandsetBrandXiaoMi(brandName: String) : HandsetBrand(brandName) {
    override fun run() {
        println("$brandName 手机")
        soft?.run()
    }
}