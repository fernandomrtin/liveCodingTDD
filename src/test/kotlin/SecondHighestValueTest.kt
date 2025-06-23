import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class SecondHighestValueTest {

    @Test
    fun `returns second highest value when values are distinct`() {
        val solver = SecondHighestValue()
        val result = solver.secondHighestValue(intArrayOf(5, 1, 3))
        assertEquals(3, result)
    }

    @Test
    fun `returns second highest when highest is duplicated`() {
        val solver = SecondHighestValue()
        val result = solver.secondHighestValue(intArrayOf(2, 2, 1))
        assertEquals(1, result)
    }

    @Test
    fun `returns -1 when no second highest exists`() {
        val solver = SecondHighestValue()
        val result = solver.secondHighestValue(intArrayOf(1, 1, 1))
        assertEquals(-1, result)
    }
}