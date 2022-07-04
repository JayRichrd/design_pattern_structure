package kt.com.tencent.cain.desigin_pattern.template

/**
 * @author : jiangyu
 * @date   : 2019/11/3
 * @desc   : 模版设计模式的模版父类
 */
abstract class TemplateAbstract {
    /**
     * 留给具体的子类去实现的方法
     */
    abstract fun primitiveOperation1()

    abstract fun primitiveOperation2()

    fun templateMethod() {
        primitiveOperation1()
        primitiveOperation2()
    }
}