package jv.com.tencent.cain.design_pattern.interpret;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cainjiang
 * @date 2020/8/19
 */
public class InterpretPattern {
    public static void main(String[] args) {
        List<AbstractExpression> expressionList = new ArrayList<>();
        expressionList.add(new TerminalExpression());
        expressionList.add(new TerminalExpression());
        expressionList.add(new NonterminalExpression());
        expressionList.add(new TerminalExpression());
        expressionList.add(new NonterminalExpression());
        Context context = new Context();
        context.setInput("输入文本");
        context.setOutput("输出文本");
        for (AbstractExpression expression : expressionList) {
            expression.interpret(context);
        }

    }
}
