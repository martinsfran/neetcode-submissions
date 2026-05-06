class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var maxLimit = nums.size -1
        var minLimit = 0
        
        while (minLimit <= maxLimit) {
            val mid = (minLimit + maxLimit) / 2
            val midValue = nums[mid]
            if (midValue == target){
                return mid
            } else if (midValue > target){
                maxLimit = mid -1
            }else {
                minLimit = mid + 1
            }
        
        }
        return -1
    }
}
