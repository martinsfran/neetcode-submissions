class Solution {
    fun groupAnagrams(strs: Array<String>):List<List<String>> {
        val hashMap = HashMap<List<Int>, MutableList<String>>()
        val aInt = "a".asSequence().toList()[0].toInt()
        
        for ((i,word) in strs.withIndex()){
            val wordArray = MutableList(26) { 0 }
            val charSet = word.lowercase().asSequence().toList()
            for (aaschi in charSet){
                val letterIndex = aaschi.toInt() - aInt
                wordArray[letterIndex] = wordArray[letterIndex] + 1
                
            }
            val currentList = hashMap.get(wordArray) ?:  mutableListOf<String>()
            currentList.add(word)
            hashMap[wordArray] = currentList
        }
        return hashMap.values.map{it.toList()}.toList()
    }
}