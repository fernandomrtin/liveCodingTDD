import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class FindTheIndexOfFirstOccurrenceInStringTest {

    @Test
    fun `returns index of first occurrence`() {
        val calculator = FindTheIndexOfFirstOccurrenceInString()
        val result = calculator.strStr(haystack = "sadbutsad", needle = "sad")
        assertEquals(0, result)
    }

    @Test
    fun `returns index of first occurrence complex`() {
        val calculator = FindTheIndexOfFirstOccurrenceInString()
        val result = calculator.strStr(haystack = "buthappybuthappy", needle = "happy")
        assertEquals(3, result)
    }

    @Test
    fun `returns -1 if no occurrence`() {
        val calculator = FindTheIndexOfFirstOccurrenceInString()
        val result = calculator.strStr(haystack = "leetcode", needle = "leeto")
        assertEquals(-1, result)
    }
}