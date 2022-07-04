package kt.com.tencent.cain.desigin_pattern.decorator

/**
 * @author cainjiang
 * @date 2019-03-31
 * 装饰者的父类,持有一个被装饰者的引用
 */
open class Finery(private var compenet: Person? = null) : Person() {
    fun decorate(compenet: Person?) {
        this.compenet = compenet
    }

    override fun show() {
        compenet?.show()
    }
}