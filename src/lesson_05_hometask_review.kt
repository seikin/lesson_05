fun main(){
    val list = listOf("HD", "UHD", "4K", "4K Ultra")
    println(getbyindex(list,3))
    println(getbyindex(list,6))


}

fun getbyindex(list: List<String>, index: Int): String{
    return try {
        list[index]
    } catch (e:Exception){
        "No index"
    } finally {
        "End of"
    }
}