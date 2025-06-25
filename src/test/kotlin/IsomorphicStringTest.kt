import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class IsomorphicStringTest {

    @Test
    fun `returns true when the strings are isomorphic`() {
        val calculator = IsomorphicString()
        val result = calculator.isIsomorphic(s = "egg", t = "add")
        assertEquals(true, result)
    }

    @Test
    fun `returns true when the strings are not isomorphic`() {
        val calculator = IsomorphicString()
        val result = calculator.isIsomorphic(s = "foo", t = "bar")
        assertEquals(false, result)
    }
}