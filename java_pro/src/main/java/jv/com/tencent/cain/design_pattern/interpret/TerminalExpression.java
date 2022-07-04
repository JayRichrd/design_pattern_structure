package jv.com.tencent.cain.design_pattern.interpret;

/**
 * @author cainjiang
 * @date 2020/8/19
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    void interpret(Context context) {
        System.out.println("终端解释器");
        System.out.println(context.toString());
    }
}
