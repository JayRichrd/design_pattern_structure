package kt.com.tencent.cain.desigin_pattern.command

/**
 * @author cainjiang
 * @date 2020/7/20
 */
class ConcrectCommand(receiver: Receiver) : BaseCommand(receiver) {
    override fun execute() {
        receiver.action()
    }
}