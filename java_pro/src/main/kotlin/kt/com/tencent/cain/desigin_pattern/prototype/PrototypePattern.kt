package kt.com.tencent.cain.desigin_pattern.prototype

/**
 * @author : jiangyu
 * @date   : 2020/2/5
 * @desc   : 使用kotlin的dataclass来实现原型设计模式
 */

fun main() {
    val person1 = Person("小张","男",24,"重庆")
    val person2 = person1.copy()
    val person3 = person1.copy(name = "小李",age = 26)
    println("person1: ${person1.hashCode()}, ${person1.dispaly()}")
    println("person2: ${person2.hashCode()}, ${person2.dispaly()}")
    println("person3: ${person3.hashCode()}, ${person3.dispaly()}")
}