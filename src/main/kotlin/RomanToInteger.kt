/**
 * https://leetcode.com/problems/roman-to-integer
 */
class RomanToInteger {
    fun calculateInteger(romanNumber: String): Int {
        var result = 0
        var index = 0
        while (index < romanNumber.length) {
            val symbolValue = romanSymbolToNumber(symbol = romanNumber[index])
            if (index + 1 < romanNumber.length) {
                val nextSymbolValue = romanSymbolToNumber(symbol = romanNumber[index + 1])
                if (nextSymbolValue > symbolValue) {
                    result = result + (nextSymbolValue - symbolValue)
                    index++
                    index++
                } else {
                    result = result + symbolValue
                    index++
                }
            } else {
                result = result + symbolValue
                index++
            }
        }
        return result
    }

    fun romanSymbolToNumber(symbol: Char): Int {
        return when (symbol) {
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}