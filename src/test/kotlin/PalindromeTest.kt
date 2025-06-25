import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class PalindromeTest {

    @Test
    fun `returns true when the sentence is a palindrome complex`() {
        val calculator = Palindrome()
        val result = calculator.isPalindrome(s = "A man, a plan, a canal: Panama")
        assertEquals(true, result)
    }

    @Test
    fun `returns true when the sentence is not a palindrome`() {
        val calculator = Palindrome()
        val result = calculator.isPalindrome(s = "race a car")
        assertEquals(false, result)
    }

    @Test
    fun `returns true when the sentence is empty`() {
        val calculator = Palindrome()
        val result = calculator.isPalindrome(s = " ")
        assertEquals(true, result)
    }
}