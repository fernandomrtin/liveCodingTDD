/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii
 */
class MaxProfit2 {
    fun maxProfit(prices: IntArray): Int {
        var actualMinimum = 10000
        var maxProfit = 0
        for (i in 0 until prices.size) {
            if (prices[i] < actualMinimum) {
                actualMinimum = prices[i]
            }
            val profit = prices[i] - actualMinimum
            if (profit > 0) {
                maxProfit = maxProfit + profit
                actualMinimum = prices[i]
            }
        }
        return maxProfit
    }
}