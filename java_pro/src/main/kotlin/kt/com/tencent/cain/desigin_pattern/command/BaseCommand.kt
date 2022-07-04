package kt.com.tencent.cain.desigin_pattern.command

/**
 * @author cainjiang
 * @date 2020/7/20
 */
abstract class BaseCommand(val receiver: Receiver) {
    abstract fun execute()
}