package jv.com.tencent.cain.design_pattern.interpret;

/**
 * @author cainjiang
 * @date 2020/8/19
 */
abstract class AbstractExpression {
    abstract void interpret(Context context);
}
