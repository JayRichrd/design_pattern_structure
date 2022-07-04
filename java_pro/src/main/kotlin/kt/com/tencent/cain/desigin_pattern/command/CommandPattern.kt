package kt.com.tencent.cain.desigin_pattern.command

/**
 * @author cainjiang
 * @date 2020/7/20
 */

fun main() {
    val receiver = Receiver()
    val command: BaseCommand = ConcrectCommand(receiver)
    val invoker = Invoker(command)
    invoker.executeCommand()
    println("Hello World.")
}