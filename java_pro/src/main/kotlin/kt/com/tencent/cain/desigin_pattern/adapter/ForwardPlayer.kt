package kt.com.tencent.cain.desigin_pattern.adapter

/**
 * @author cainjiang
 * @date 2020/4/15
 */
class ForwardPlayer(name: String) : Player(name) {

    override fun attack() {
        println("ForwardPlayer# $name attack ---")
    }

    override fun defense() {
        println("ForwardPlayer# $name defense ---")
    }

}