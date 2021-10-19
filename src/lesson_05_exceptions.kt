fun main(){
    println("Введите числовое значение для переменной numInt1: ")
    val numInt1 = readLine()!!
    println("Введите числовое значение для переменной numInt2: ")
    val numInt2 = readLine()!!
    val b: Int = try {
        numInt1.toInt() / numInt2.toInt()
    } catch (e: NumberFormatException) {
        println("Можно вводить только числа")
        20
    } catch (e: Exception){
        println(e::class.java.simpleName)
        println("На ноль делить нельзя")
        10
    } finally {
        print("Программа завершена")
    }
}