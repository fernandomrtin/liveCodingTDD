/**
 * https://leetcode.com/problems/valid-anagram
 */
class Anagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val map = hashMapOf<Char, Int>()
        for (i in 0 until s.length) {
            val element = map.getOrElse(s[i]) { 0 }
            if (element == 0) {
                map[s[i]] = 1
            } else {
                map[s[i]] = element + 1
            }
        }

        val map2 = hashMapOf<Char, Int>()
        for (i in 0 until t.length) {
            val element = map2.getOrElse(t[i]) { 0 }
            if (element == 0) {
                map2[t[i]] = 1
            } else {
                map2[t[i]] = element + 1
            }
        }
        return areMapsEqual(map, map2)
    }

    fun areMapsEqual(map1: Map<Char, Int>, map2: Map<Char, Int>): Boolean {
        if (map1.size != map2.size) return false
        for ((key, value) in map1) {
            if (map2[key] != value) return false
        }
        return true
    }
}