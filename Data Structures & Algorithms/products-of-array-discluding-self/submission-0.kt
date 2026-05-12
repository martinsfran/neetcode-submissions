class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val multiplierList = mutableListOf<Int>()
        val result = IntArray(nums.size) { 1 }
        val zeroResult = IntArray(nums.size) { 0 }
        var hasZero = false
        var hasMoreThanOneZero = false
        var latestMultiplier = 1
        for (num in nums) {
            if (num == 0 && !hasZero){
                hasZero = true
            } else if (num == 0 && hasZero){
                hasMoreThanOneZero = true
                break
            } else {
                latestMultiplier *= num
            }
            
            multiplierList.add(latestMultiplier)
        }

        if (hasMoreThanOneZero) {
            return IntArray(nums.size) {0}
        } 
        
        for (i in multiplierList.indices) {
            val num = nums[i]
            if (hasZero) {
                if (num == 0){
                    zeroResult[i] = latestMultiplier
                } else {
                    zeroResult[i] = 0
                }
            } else {
                if (num == 0){
                    result[i] = num
                } else {
                    result[i] = latestMultiplier / num
                }
            }
        }
        if (hasZero) {
            return zeroResult
        } else {
            return result
        }

    }
}
