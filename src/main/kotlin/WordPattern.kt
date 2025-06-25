/**
 * https://leetcode.com/problems/word-pattern
 */
class WordPattern {
    fun wordPattern(pattern: String, s: String): Boolean {
        var result = true
        val mapPattern = hashMapOf<String, String>()
        val mapWords = hashMapOf<String, String>()
        val splitSentence = s.split(" ")
        if (pattern.length != splitSentence.size) {
            return false
        }
        for (i in 0 until splitSentence.size) {
            val storedWord = mapWords.getOrElse(pattern[i].toString()) { "" }
            val storedLetter = mapPattern.getOrElse(splitSentence[i]) { "" }
            if (storedWord.isEmpty() && storedLetter.isEmpty()) {
                mapPattern[splitSentence[i]] = pattern[i].toString()
                mapWords[pattern[i].toString()] = splitSentence[i]
            } else if (mapPattern[splitSentence[i]] == pattern[i].toString() && mapWords[pattern[i].toString()] == splitSentence[i]) {
                result = true
            } else {
                result = false
                break
            }
        }
        return result
    }
}