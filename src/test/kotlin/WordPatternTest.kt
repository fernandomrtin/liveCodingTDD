import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class WordPatternTest {

    @Test
    fun `returns true the pattern is correct`() {
        val calculator = WordPattern()
        val result = calculator.wordPattern(pattern = "abba", s = "dog cat cat dog")
        assertEquals(true, result)
    }

    @Test
    fun `returns false the pattern is not correct`() {
        val calculator = WordPattern()
        val result = calculator.wordPattern(pattern = "abba", s = "dog cat cat fish")
        assertEquals(false, result)
    }

    @Test
    fun `returns true when the pattern and the list of words contains the same value`() {
        val calculator = WordPattern()
        val result = calculator.wordPattern(pattern = "a", s = "a")
        assertEquals(true, result)
    }

    @Test
    fun `returns true when the pattern is correct simple`() {
        val calculator = WordPattern()
        val result = calculator.wordPattern(pattern = "abc", s = "b c a")
        assertEquals(true, result)
    }
}