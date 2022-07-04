package kt.com.tencent.cain.desigin_pattern.adapter

/**
 * @author cainjiang
 * @date 2020/4/15
 */
fun main() {
    val forwardPlayer = ForwardPlayer("Battier")
    val guardPlayer = GuardPlayer("McGrady")
    val centerPlayer = TranslateAdapter("Translator", ForeignCenterPlayer("Yao Ming"))
    println("--- start play ---")
    forwardPlayer.attack()
    guardPlayer.defense()
    centerPlayer.defense()
}