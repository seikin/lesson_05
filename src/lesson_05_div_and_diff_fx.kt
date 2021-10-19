fun main(){
    println("Введите целое число num1")
    val num1 = readLine()!!.toInt()
    println("Введите целое число num2")
    val num2 = readLine()!!.toInt()

    println("Введите целое число num3")
    val num3 = readLine()!!.toInt()
    println("Введите целое число num4")
    val num4 = readLine()!!.toInt()

    val divresult = div(num1, num2)
    println(message = "Результат деления: $divresult")

    val diffresult = diff(num3, num4)
    println(message = "Результат сравнения: $diffresult")
}

//Длинный вариант fx div
// fun div(num1: Int, num2: Int): Float {
//    return num1.toFloat() / num2.toFloat()
//}

//Короткий вариант записи fx div. знак = заменяет return
fun div(num1: Int, num2: Int) = num1.toFloat() / num2.toFloat()

//fx diff. Упрощенная запись нижеследующего кода: fun diff (num3: Int, num4: Int): Int = if (num3 > num4) num3 else num4
fun diff (num3: Int, num4: Int): Int {
    if (num3 > num4){
        return num3
    } else {
        return num4
    }
}