package kt.com.tencent.cain.desigin_pattern.bridge

/**
 * @author : jiangyu
 * @date   : 2020/7/11
 * @desc   : 桥接设计模式-剥离出来的一个分支
 */
abstract class HandsetSoft(var softName: String = "") {
    abstract fun run()
}