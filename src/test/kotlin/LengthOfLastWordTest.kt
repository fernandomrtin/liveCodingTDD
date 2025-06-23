import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class LengthOfLastWordTest {

    @Test
    fun `returns length of last word`() {
        val calculator = LengthOfLastWord()
        val result = calculator.lengthOfLastWord(s = "Hello World")
        assertEquals(5, result)
    }

    @Test
    fun `returns length of last word not counting white spaces`() {
        val calculator = LengthOfLastWord()
        val result = calculator.lengthOfLastWord(s = "   fly me   to   the moon  ")
        assertEquals(4, result)
    }

    @Test
    fun `returns length of white space`() {
        val calculator = LengthOfLastWord()
        val result = calculator.lengthOfLastWord(s = " ")
        assertEquals(0, result)
    }
}