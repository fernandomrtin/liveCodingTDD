import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class FactorialTest {

    @Test
    fun `returns the factorial value of the given number`() {
        val calculator = Factorial()
        val result = calculator.factorial(n = 3)
        assertEquals(6, result)
    }

    @Test
    fun `returns the factorial value of the given number complex`() {
        val calculator = Factorial()
        val result = calculator.factorial(n = 10)
        assertEquals(3628800, result)
    }
}