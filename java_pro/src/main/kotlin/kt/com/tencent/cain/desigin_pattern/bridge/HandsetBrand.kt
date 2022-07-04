package kt.com.tencent.cain.desigin_pattern.bridge

/**
 * @author : jiangyu
 * @date   : 2020/7/11
 * @desc   : 桥接设计模式-剥离出来的一个分支
 */
abstract class HandsetBrand(var brandName: String, var soft: HandsetSoft? = null) {
    abstract fun run()
}