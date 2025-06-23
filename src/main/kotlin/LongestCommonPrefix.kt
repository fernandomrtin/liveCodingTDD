/**
 * https://leetcode.com/problems/longest-common-prefix
 */
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        var result = ""
        for (i in 0 until strs[0].length) {
            val toProcessChar = strs[0][i]
            var allCoincidence = false
            for (j in 0 until strs.size) {
                if (strs[j].length > i && strs[j][i] == toProcessChar) {
                    allCoincidence = true
                } else {
                    allCoincidence = false
                    break
                }
            }
            if (allCoincidence) {
                result+=toProcessChar
            } else {
                break
            }
        }
        return result
    }
}