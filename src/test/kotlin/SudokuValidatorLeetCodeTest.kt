import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SudokuValidatorLeetCodeTest {

    @Test
    fun `returns true when the sudoku example can be solved`() {
        val calculator = SudokuValidatorLeetCode()
        val board = arrayOf(
            charArrayOf('5','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )
        val result = calculator.isValidSudoku(board = board)
        assertEquals(true, result)
    }

    @Test
    fun `returns false when the sudoku example can be solved`() {
        val calculator = SudokuValidatorLeetCode()
        val board = arrayOf(
            charArrayOf('8','3','.','.','7','.','.','.','.'),
            charArrayOf('6','.','.','1','9','5','.','.','.'),
            charArrayOf('.','9','8','.','.','.','.','6','.'),
            charArrayOf('8','.','.','.','6','.','.','.','3'),
            charArrayOf('4','.','.','8','.','3','.','.','1'),
            charArrayOf('7','.','.','.','2','.','.','.','6'),
            charArrayOf('.','6','.','.','.','.','2','8','.'),
            charArrayOf('.','.','.','4','1','9','.','.','5'),
            charArrayOf('.','.','.','.','8','.','.','7','9')
        )
        val result = calculator.isValidSudoku(board = board)
        assertEquals(false, result)
    }

    @Test
    fun `returns false when the sudoku example can be solved 2`() {
        val calculator = SudokuValidatorLeetCode()
        val board = arrayOf(
            charArrayOf('.','.','4','.','.','.','6','3','.'),
            charArrayOf('.','.','.','.','.','.','.','.','.'),
            charArrayOf('5','.','.','.','.','.','.','9','.'),
            charArrayOf('.','.','.','5','6','.','.','.','.'),
            charArrayOf('4','.','3','.','.','.','.','.','1'),
            charArrayOf('.','.','.','7','.','.','.','.','.'),
            charArrayOf('.','.','.','5','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','.','.','.','.')
        )
        val result = calculator.isValidSudoku(board = board)
        assertEquals(false, result)
    }

    @Test
    fun `returns false when the square is not valid`() {
        val calculator = SudokuValidatorLeetCode()
        val board = arrayOf(
            charArrayOf('.','.','.','.','5','.','.','1','.'),
            charArrayOf('.','4','.','3','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','3','.','.','1'),
            charArrayOf('8','.','.','.','.','.','.','2','.'),
            charArrayOf('.','.','2','.','7','.','.','.','.'),
            charArrayOf('.','1','5','.','.','.','.','.','.'),
            charArrayOf('.','.','.','.','.','2','.','.','.'),
            charArrayOf('.','2','.','9','.','.','.','.','.'),
            charArrayOf('.','.','4','.','.','.','.','.','.')
        )
        val result = calculator.isValidSudoku(board = board)
        assertEquals(false, result)
    }

}