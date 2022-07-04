package kt.com.tencent.cain.desigin_pattern.state

/**
 * @author : jiangyu
 * @date   : 2020/3/28
 * @desc   : 状态设计模式
 */

fun main() {
    val work = Work()
    work.curTimeHour = 10
    work.doWork()
    work.curTimeHour = 13
    work.doWork()
    work.curTimeHour = 15
    work.doWork()
    work.curTimeHour = 20
    work.doWork()
    work.isFinished = true
    work.doWork()
}