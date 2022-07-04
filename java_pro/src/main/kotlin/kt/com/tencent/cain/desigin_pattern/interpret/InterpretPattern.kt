package kt.com.tencent.cain.desigin_pattern.interpret

/**
 * @author : jiangyu
 * @date   : 2020/8/19
 * @desc   : xxx
 */
fun main() {
    val expressionList = mutableListOf<AbstractExpression>()
    expressionList.add(TerminalExpression())
    expressionList.add(TerminalExpression())
    expressionList.add(NonternimalExpression())
    expressionList.add(NonternimalExpression())
    val ctx = Context("ahahah", "hehehe")
    expressionList.forEach {
        it.interpret(ctx)
    }
}