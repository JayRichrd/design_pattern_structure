package kt.com.tencent.cain.desigin_pattern.visitor

/**
 * @author : jiangyu
 * @date   : 2020/8/23
 * @desc   : xxx
 */
enum class VisitorElementType(val typeName: String, val typeDesc: String) {
    TYPE_MALE("男", "男性用户"),
    TYPE_FMALE("女", "女性用户")
}