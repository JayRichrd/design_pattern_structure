package kt.com.tencent.cain.desigin_pattern.adapter

/**
 * @author cainjiang
 * @date 2020/4/15
 */
class GuardPlayer(name: String) : Player(name) {

    override fun attack() {
        println("GuardPlayer# $name attack ---")
    }

    override fun defense() {
        println("GuardPlayer# $name defense ---")
    }

}