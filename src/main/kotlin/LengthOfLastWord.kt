/**
 * https://leetcode.com/problems/length-of-last-word/
 */
class LengthOfLastWord {
    fun lengthOfLastWord(s: String): Int {
        var result = 0
        var index = 0
        var markedFlag = false
        while (index < s.length) {
            if (s[index] != ' ') {
                if (!markedFlag) {
                    result++
                } else {
                    result = 1
                    markedFlag = false
                }
            } else {
                markedFlag = true
            }
            index++
        }
        return result
    }
}