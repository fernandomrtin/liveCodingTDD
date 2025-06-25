/**
 * https://leetcode.com/problems/valid-palindrome
 */
class IsomorphicString {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = hashMapOf<Char, Boolean>()
        var differentLetters = 0
        for (i in 0 until s.length) {
            if (!map.getOrElse(s[i]) { false }) {
                differentLetters ++
                map[s[i]] = true
            }
        }

        val map2 = hashMapOf<Char, Boolean>()
        var differentLettersSecondString = 0
        for (i in 0 until t.length) {
            if (!map2.getOrElse(t[i]) { false }) {
                differentLettersSecondString ++
                map2[t[i]] = true
            }
        }
        return differentLetters == differentLettersSecondString
    }
}