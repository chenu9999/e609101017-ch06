fun main() {
    var beverage = readLine()
    //beverage = null

    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - beverage was null!")
    }

    val beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed)
    //  空合併運算子(?:) 如果運算子左邊的求值結果為null 則採用右邊的結果值
}