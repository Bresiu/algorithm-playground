package training.hashmap

class TwoSum {
    fun solve(nums: IntArray, target: Int): IntArray {
        val neededValue = hashMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            neededValue[num]?.let {
                return intArrayOf(it, index)
            }
            neededValue[target - num] = index
        }
        throw IllegalArgumentException("No two sum solution")
    }
}