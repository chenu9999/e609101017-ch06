import java.lang.IllegalStateException

fun main() {
    var swordsJuggling: Int? = null
    val isJugglingProficient = (1..3).shuffled().last() == 3
    if (isJugglingProficient) swordsJuggling = 2  //if else句型省略

    proficiencyCheck(swordsJuggling)
    swordsJuggling = swordsJuggling!!.plus(1)

    println("你耍了$swordsJuggling" + "把劍!")
}

fun proficiencyCheck(swordsJuggling: Int?) {
    swordsJuggling ?: throw IllegalStateException("玩家不會耍劍")
}