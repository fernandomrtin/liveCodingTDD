import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class RomanToIntegerTest {

    @Test
    fun `returns correct value with a simple input`() {
        val romanToIntegerCalculator = RomanToInteger()
        val result = romanToIntegerCalculator.calculateInteger(romanNumber = "III")
        assertEquals(3, result)
    }

    @Test
    fun `returns correct value with a medium input`() {
        val romanToIntegerCalculator = RomanToInteger()
        val result = romanToIntegerCalculator.calculateInteger(romanNumber = "LVIII")
        assertEquals(58, result)
    }

    @Test
    fun `returns correct value with a complex input`() {
        val romanToIntegerCalculator = RomanToInteger()
        val result = romanToIntegerCalculator.calculateInteger(romanNumber = "MCMXCIV")
        assertEquals(1994, result)
    }
}