class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seenOriginal = HashMap<Int, Int>()
        
        for (i in 0 until nums.size) {
            val original = nums[i]
            val processed = target - original
            if (seenOriginal.keys.contains(processed)){
                val pos1 = seenOriginal[processed] ?:0
                val pos2 = i
                return intArrayOf(pos1, pos2)
            }
            if (!seenOriginal.keys.contains(original)){
                seenOriginal[original] = i
            }
        
        }
        return intArrayOf(0,0)//fallback


    }
}