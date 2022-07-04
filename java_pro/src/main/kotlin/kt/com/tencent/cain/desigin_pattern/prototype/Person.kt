package kt.com.tencent.cain.desigin_pattern.prototype

/**
 * @author : jiangyu
 * @date   : 2020/2/5
 * @desc   : xxx
 */
data class Person(val name: String, val gender: String, val age: Int, val birthPlace: String) {
    fun dispaly() {
        println("个人信息，姓名：$name, 性别：$gender, 年龄：$age, 籍贯：$birthPlace")
    }
}