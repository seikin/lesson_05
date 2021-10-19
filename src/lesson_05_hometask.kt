//don’t repeat yourself
// Создайте функцию, принимающую в себя строковый список произвольной длины list и
// целое число index.
// Верните из функции значение list[index] если таковое имеется,
// в противном же случае обработайте исключение и
// верните сообщение "Список не содержит в себе значение с данным индексом".
// Пример входных данных: list = listOf("Macbook", "iPad", "iPhone", "iMac"), index = 3
// Пример результата: "iMac"
// Пример входных данных: list = listOf("Macbook", "iPad", "iPhone", "iMac"), index = 6
// Пример результата: "Список не содержит в себе значение с данным индексом"

fun main(){
    val list: List<String> = listOf("Macbook", "Тимур", "iPhone", "iMac")
    print("Введите положительное целочисленное значение для index: ")
    val index = readLine()!!.toInt()
    stringlistimport (list, index)

}
fun stringlistimport (list: List<String> = listOf("Macbook", "iPad", "iPhone", "iMac"), index: Int) {
        try {
            println("С индексом $index обнаружено значение ${list[index]}")
        } catch (e: Exception) {
            println("Список не содержит в себе значение с данным индексом")
        } finally {
            println("Завершение программы")
        }
}