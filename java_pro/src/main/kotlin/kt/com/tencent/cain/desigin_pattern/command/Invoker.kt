package kt.com.tencent.cain.desigin_pattern.command

/**
 * @author cainjiang
 * @date 2020/7/20
 */
class Invoker(var command: BaseCommand) {
    fun executeCommand() {
        command.execute()
    }
}