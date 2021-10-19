/* функция sumDigits считает сумму цифр переданногоей числа*/
fun main(){
    val num = readLine()!!.toInt()
    val sum = sumDigits(num)
    println(sum)
}

fun sumDigits(number: Int):Int{
    var i = number
    var sum = 0

    while (i > 0){
        sum = sum + i % 10
        i = i / 10
    }
    return sum
}