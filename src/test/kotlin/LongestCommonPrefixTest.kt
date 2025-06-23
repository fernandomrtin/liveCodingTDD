import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class LongestCommonPrefixTest {

    @Test
    fun `returns length of last word`() {
        val calculator = LongestCommonPrefix()
        val result = calculator.longestCommonPrefix(strs = arrayOf("flower","flow","flight"))
        assertEquals("fl", result)
    }

    @Test
    fun `returns the word as the common prefix when we have just one word`() {
        val calculator = LongestCommonPrefix()
        val result = calculator.longestCommonPrefix(strs = arrayOf("flower"))
        assertEquals("flower", result)
    }

    @Test
    fun `returns no coincidence when the words do not start with the same letter`() {
        val calculator = LongestCommonPrefix()
        val result = calculator.longestCommonPrefix(strs = arrayOf("flower", "world", "museum"))
        assertEquals("", result)
    }
}