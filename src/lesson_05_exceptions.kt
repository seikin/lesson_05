fun main(){
    print("Введите числовое значение для переменной numInt: ")
    val numInt = readLine()!!
    val b: Int
    try {
        b = numInt.toInt() + 10
        print("Значение суммы введенной переменной +10 равно: $b")
    } catch (e: Exception) {
        print("numInt is not Integer")
    }
}