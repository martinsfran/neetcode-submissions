class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val rows = Array(9) { BooleanArray(9) }
        val cols = Array(9) { BooleanArray(9) }
        val boxes = Array(9) { BooleanArray(9) }

        for (r in 0 until 9) {
            for (c in 0 until 9) {

                val ch = board[r][c]
                if (ch == '.') continue

                val num = ch.digitToInt() - 1
                val box = (r / 3) * 3 + (c / 3)

                if (rows[r][num] ||
                    cols[c][num] ||
                    boxes[box][num]) {
                    return false
                }

                rows[r][num] = true
                cols[c][num] = true
                boxes[box][num] = true
            }
        }

        return true
    }
}