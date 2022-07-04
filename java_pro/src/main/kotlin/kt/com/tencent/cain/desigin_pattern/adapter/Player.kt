package kt.com.tencent.cain.desigin_pattern.adapter

/**
 * @author cainjiang
 * @date 2020/4/15
 */
abstract class Player(val name: String) {
    abstract fun attack()
    abstract fun defense()
}