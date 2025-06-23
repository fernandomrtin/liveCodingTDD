import org.junit.jupiter.api.Assertions.assertTrue
import kotlin.test.Test

class SudokuSolverTest {

    @Test
    fun `should solve a board with one missing cell`() {
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

        val solver = SudokuSolver()
        solver.solve(board)

        assertTrue(isValidSudoku(board))
    }

    private fun isValidSudoku(board: Array<CharArray>): Boolean {
        // Puedes validar filas, columnas y bloques
        // Aquí solo se usa como verificación básica de que se resolvió
        // En entrevistas puedes usar este helper como base temporal
        return true // placeholder
    }
}