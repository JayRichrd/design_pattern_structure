package kt.com.tencent.cain.desigin_pattern.interpret

/**
 * @author : jiangyu
 * @date   : 2020/8/19
 * @desc   : xxx
 */
abstract class AbstractExpression {
    abstract fun interpret(ctx: Context)
}