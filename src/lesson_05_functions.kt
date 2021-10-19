fun main(){
    val words: Array<String> = Array(5){ "" }

    printArray(words)
    fillArray(words,"Apple")
    printArray(words)

}

fun printArray(array: Array<String>) {
    for (i in array) print("$i, ")
    println()
}

fun fillArray(array: Array<String>, name: String){
    for (i in array.indices){
        array[i] = "$name ${readLine()!!}"
    }
}