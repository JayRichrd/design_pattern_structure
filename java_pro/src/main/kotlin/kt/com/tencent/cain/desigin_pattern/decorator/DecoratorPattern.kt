package kt.com.tencent.cain.desigin_pattern.decorator

/**
 * @author cainjiang
 * @date 2019-03-31
 */

fun main() {
    val person = Person("攻城狮")
    val bigTrouser = BigTrouser()
    val tShirts = TShirts()

    bigTrouser.decorate(person)
    tShirts.decorate(bigTrouser)
    tShirts.show()
}