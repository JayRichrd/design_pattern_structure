package jv.com.tencent.cain.design_pattern.interpret;

/**
 * @author cainjiang
 * @date 2020/8/19
 */
public class NonterminalExpression extends AbstractExpression {
    @Override
    void interpret(Context context) {
        System.out.println("非终端解释器");
        System.out.println(context);
    }
}
