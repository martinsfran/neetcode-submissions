class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val hashMap = LinkedHashMap<Int,Int>()
        for (num in nums){
            val hashValue = hashMap.get(num) ?: 0
            hashMap[num] = hashValue + 1
        }
        val sortedByValue = hashMap.entries.sortedByDescending { it.value }.associate { it.toPair() }
        val candidates = sortedByValue.values.take(k)
        val keys = sortedByValue.keys.take(k)
        return keys.toIntArray()
    }
}
