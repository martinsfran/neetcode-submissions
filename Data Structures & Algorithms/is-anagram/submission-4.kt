class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val count = HashMap<Char, Int>()

        for (c in s) {
            count[c] = count.getOrDefault(c, 0) + 1
        }

        for (c in t) {
            val current = count[c] ?: return false
            if (current == 1) {
                count.remove(c)
            } else {
                count[c] = current - 1
            }
        }

        return count.isEmpty()
    }
}
