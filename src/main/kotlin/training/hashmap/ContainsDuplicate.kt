package training.hashmap

class ContainsDuplicate {
    fun solve(nums: IntArray): Boolean {
        val seen = hashSetOf<Int>()
        nums.forEach { num ->
            if (seen.contains(num)) {
                return true
            } else {
                seen.add(num)
            }
        }
        return false
    }
}