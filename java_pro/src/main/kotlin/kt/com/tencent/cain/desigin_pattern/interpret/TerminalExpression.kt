package kt.com.tencent.cain.desigin_pattern.interpret

/**
 * @author : jiangyu
 * @date   : 2020/8/19
 * @desc   : xxx
 */
class TerminalExpression : AbstractExpression() {
    override fun interpret(ctx: Context) {
        println("终端解释器, ctx：$ctx")
    }
}