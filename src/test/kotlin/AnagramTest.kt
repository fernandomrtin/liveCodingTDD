import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class AnagramTest {

    @Test
    fun `returns true when the anagram is correct`() {
        val calculator = Anagram()
        val result = calculator.isAnagram(s = "anagram", t = "nagaram")
        assertEquals(true, result)
    }

    @Test
    fun `returns true when the anagram is incorrect`() {
        val calculator = Anagram()
        val result = calculator.isAnagram(s = "car", t = "rat")
        assertEquals(false, result)
    }
}