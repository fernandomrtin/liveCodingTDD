
/**
 * https://leetcode.com/problems/valid-sudoku/description/
 */
class SudokuValidatorLeetCode {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until board.size) {
            val rowIsValid = isValid(array = board[i])
            if (rowIsValid) {
                val columnArray = mutableListOf<Char>()
                for (j in 0 until board.size) {
                    columnArray.add(board[j][i])
                }
                val columnIsValid = isValid(array = columnArray.toCharArray())
                if (!columnIsValid) {
                    return false
                }
            } else {
                return false
            }
        }
        for (startRow in listOf(0, 3, 6)) {
            for (startCol in listOf(0, 3, 6)) {
                val block = mutableListOf<Char>()
                for (i in 0 until 3) {
                    for (j in 0 until 3) {
                        block.add(board[startRow + i][startCol + j])
                    }
                }
                val blockIsValid = isValid(array = block.toCharArray())
                if (!blockIsValid) {
                    return false
                }
            }
        }
        return true
    }

    private fun isValid(array: CharArray): Boolean {
        val isValid = true
        val map = hashMapOf<Char, Boolean>()
        for (i in 0 until array.size) {
            val element = array[i]
            if (element != '.' && element.digitToInt() < 1 && element.digitToInt() > 9) {
                return false
            } else if (element != '.' && map[element] != null) {
                return false
            } else {
                map[element] = true
            }
        }
        return isValid
    }

    fun isValidSudoku2(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            if (!isValid2(board[i])) return false // fila
            if (!isValid2(CharArray(9) { board[it][i] })) return false // columna
        }

        for (startRow in listOf(0, 3, 6)) {
            for (startCol in listOf(0, 3, 6)) {
                val block = mutableListOf<Char>()
                for (i in 0 until 3) {
                    for (j in 0 until 3) {
                        block.add(board[startRow + i][startCol + j])
                    }
                }
                if (!isValid2(block)) return false
            }
        }

        return true
    }

    private fun isValid2(cells: List<Char>): Boolean {
        val seen = mutableSetOf<Char>()
        for (c in cells) {
            if (c == '.') continue
            if (c in seen) return false
            seen.add(c)
        }
        return true
    }

    private fun isValid2(array: CharArray): Boolean {
        return isValid2(array.toList())
    }
}