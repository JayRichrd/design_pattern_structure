package kt.com.tencent.cain.desigin_pattern.decorator

/**
 * @author cainjiang
 * @date 2019-03-31
 * 被装饰者
 */
open class Person(val name: String = "程序员") {
    open fun show() {
        println("装扮的$name")
    }
}