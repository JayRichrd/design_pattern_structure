package kt.com.tencent.cain.desigin_pattern.decorator

/**
 * @author cainjiang
 * @date 2019-03-31
 * 具体的装饰者
 */
class TShirts : Finery() {
    override fun show() {
        print("T恤 ")
        super.show()
    }
}