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

    if (swordsJuggling == null) {
        println("玩家不會耍劍")  //多表達式寫法 此行刪除輸出結果較正確
        swordsJuggling = 0
    }
    else {println("你耍了$swordsJuggling" + "把劍!")
    }
    juggleSwords(swordsJuggling)
}

fun proficiencyCheck(swordsJuggling: Int?) {
    checkNotNull(swordsJuggling, { "玩家不會耍劍" })
    //checkNotNull:如果參數值為null 則拋出IllegalStateException異常 不為null則返回值
}

fun juggleSwords(swordsJuggling: Int) {
    require(swordsJuggling >= 3, {"至少要耍三把才厲害"})
}