class Solution {

    fun encode(strs: List<String>): String {
        if (strs.size > 0){
            println("before"+strs.size)
            val result = "#_"+strs.joinToString("#_")
            println("result"+result)
            return result
        } else {
            return ""
        }
    }

    fun decode(str: String): List<String> {
        println(str)
        if (str.isNotEmpty()) {
            return str.split("#_").drop(1)
        }else {
            return listOf()
        }
    }
}