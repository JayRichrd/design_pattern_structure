package kt.com.tencent.cain.desigin_pattern.adapter

/**
 * @author cainjiang
 * @date 2020/4/15
 * @desc 适配器模式
 * 适配层
 */
class TranslateAdapter(name: String, val centerPlayer: ForeignCenterPlayer) : Player(name) {

    override fun attack() {
        println("TranslateAdapter# ${centerPlayer.name} attack ---")
        centerPlayer.jingong()
    }

    override fun defense() {
        println("TranslateAdapter# ${centerPlayer.name} attack ---")
        centerPlayer.fangshou()
    }
}