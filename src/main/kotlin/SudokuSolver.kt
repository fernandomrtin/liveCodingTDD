class SudokuSolver {

    fun solve(board: Array<CharArray>): Boolean {
       for (row in 0 until 9) {
           for (col in 0 until 9) {
               if (board[row][col] == '.') {
                   for (c in '1'..'9') {
                       if (isValid(board, row, col, c)) {
                           board[row][col] = c
                           if (solve(board)) return true
                           board[row][col] = '.' // backtrack
                       }
                   }
                   return false // no valid number found
               }
           }
       }
        return true
    }

    private fun isValid(board: Array<CharArray>, row: Int, col: Int, c: Char): Boolean {
        for (i in 0 until 9) {
            if (board[i][col] == c) return false // check column
            if (board[row][i] == c) return false // check row
            val blockRow = 3 * (row / 3) + i / 3
            val blockCol = 3 * (col / 3) + i % 3
            if (board[blockRow][blockCol] == c) return false // check block
        }
        return true
    }
}