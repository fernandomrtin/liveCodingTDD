import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MaxProfit2Test {

    @Test
    fun `returns maximum profit with a list os historic prices`() {
        val profitCalculator = MaxProfit2()
        val result = profitCalculator.maxProfit(intArrayOf(7,1,5,3,6,4))
        assertEquals(7, result)
    }

    @Test
    fun `returns maximum profit with a list os historic prices buying same day`() {
        val profitCalculator = MaxProfit2()
        val result = profitCalculator.maxProfit(intArrayOf(1,2,3,4,5))
        assertEquals(4, result)
    }

    @Test
    fun `returns 0 profit when we have just a unique price`() {
        val profitCalculator = MaxProfit2()
        val result = profitCalculator.maxProfit(intArrayOf(1,1,1,1,1,1,1))
        assertEquals(0, result)
    }
}