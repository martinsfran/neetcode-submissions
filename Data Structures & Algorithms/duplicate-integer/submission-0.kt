

class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val distinct = nums.distinct()
        return distinct.size != nums.size
    }
}
