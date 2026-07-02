package training.hashmap

class RansomNote {
    fun solve(ransomNote: String, magazine: String): Boolean {
        // guard
        if (magazine.length < ransomNote.length) return false

        // build frequency map
        val frequencyMap = HashMap<Char, Int>()
        magazine.forEach { char ->
            frequencyMap[char] = (frequencyMap[char] ?: 0) + 1
        }

        // consume frequencies based on ransom note
        ransomNote.forEach { char ->
            val numberOfOccurrences = frequencyMap[char]
            // if character doesn't exist in magazin, or we already consumed all same characters - return false
            if (numberOfOccurrences == null || numberOfOccurrences == 0) {
                return false
            }
            frequencyMap[char] = numberOfOccurrences - 1
        }
        return true
    }
}