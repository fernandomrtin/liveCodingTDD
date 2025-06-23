/**
 * SecondHighestValue in an array
 */
class SecondHighestValue {
    fun secondHighestValue(nums: IntArray): Int {
        var highestValue = 0
        var secondHighestValue = -1
        for (i in 0 until nums.size) {
            if (highestValue <= nums[i]) {
                highestValue = nums[i]
            } else if (nums[i] > secondHighestValue) {
                secondHighestValue = nums[i]
            }
        }

        return secondHighestValue
    }
}