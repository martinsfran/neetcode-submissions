class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        val sorted = nums.sorted()
        var bestSequence = HashSet<Int>()
        val currentSequence = HashSet<Int>()
        
        for (i in sorted.size - 1 downTo 0) {
            val num = sorted[i]
            if (currentSequence.contains(num + 1)) {
                currentSequence.add(num)
            } else {
                currentSequence.clear()
                currentSequence.add(num)
            }
            if (bestSequence.contains(num + 1) || i==sorted.size - 1) {
                bestSequence.add(num)
            }else {
                if (currentSequence.size > bestSequence.size) {
                    bestSequence = HashSet(currentSequence)
                }
            }
            
        }
        return bestSequence.size
    }
}
