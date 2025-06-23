/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
 */
class FindTheIndexOfFirstOccurrenceInString {
    fun strStr(haystack: String, needle: String): Int {
        var result = -1
        for (i in 0 until haystack.length) {
            if ((i + needle.length - 1) < haystack.length) {
                val piece = haystack.substring(i, i + needle.length)
                if (piece == needle) {
                    result = i
                    break
                }
            }
        }
        return result
    }
}