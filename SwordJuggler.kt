//import java.lang.IllegalStateException

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) swordsJuggling = 2

    try {
        proficiencyCheck(swordsJuggling)
        swordsJuggling = swordsJuggling!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }

    println("你耍了$swordsJuggling" + "把劍!")
}

fun proficiencyCheck(swordsJuggling: Int?) {
    checkNotNull(swordsJuggling, { "玩家不會耍劍" })
    //checkNotNull:如果參數值為null 則拋出IllegalStateException異常 不為null則返回值
}

/*class UnskilledSwordJugglerException() :
    IllegalStateException("玩家不會耍劍")*/