fun main(){
    println("ВВведите произвольную строку")
    val word = readLine()!!.toString()
    println("Сколько раз повторить строку? введите число ")
    val count = readLine()!!.toInt()

    repeatString(word, count)
    println()
    repeatString("Apple",3)
    println()
    repeat(count = 5)

}

fun repeatString(word: String, count: Int){
    for (i in 1..count) println(word)
}

fun repeat(word: String = "Google", count: Int = 3){
    for (i in 1..count) println(word)
}