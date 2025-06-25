/**
 * https://leetcode.com/problems/valid-palindrome
 */
class Palindrome {
    fun isPalindrome(s: String): Boolean {
        val aux1 = StringBuilder()
        for (i in 0 until s.length) {
            if (s[i].isDigit() || s[i].isLetter()) {
                aux1.append(s[i].lowercaseChar())
            }
        }
        val aux2 = StringBuilder()
        for (i in aux1.length - 1 downTo 0) {
            aux2.append(aux1[i])
        }
        return aux1.toString() == aux2.toString()
    }
}