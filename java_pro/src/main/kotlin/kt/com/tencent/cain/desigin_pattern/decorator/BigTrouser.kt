package kt.com.tencent.cain.desigin_pattern.decorator

/**
 * @author cainjiang
 * @date 2019-03-31
 * 具体的装饰者
 */
class BigTrouser : Finery() {
    override fun show() {
        print("垮裤 ")
        super.show()
    }
}