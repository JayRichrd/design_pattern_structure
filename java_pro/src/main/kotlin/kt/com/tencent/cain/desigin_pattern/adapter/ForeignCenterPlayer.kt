package kt.com.tencent.cain.desigin_pattern.adapter

/**
 * @author cainjiang
 * @date 2020/4/15
 */
class ForeignCenterPlayer(val name: String) {

    fun jingong() {
        println("ForeignCenterPlayer# $name 进攻")
    }

    fun fangshou() {
        println("ForeignCenterPlayer# $name 防守")
    }
}