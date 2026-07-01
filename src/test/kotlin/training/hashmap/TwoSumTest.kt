package training.hashmap

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
    private val solution = TwoSum()

    @Test
    fun `returns indices when pair exists`() {
        val result = solution.solve(intArrayOf(2, 7, 11, 15), 9)

        assertContentEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `returns indices when pair is later in array`() {
        val result = solution.solve(intArrayOf(3, 2, 4), 6)

        assertContentEquals(intArrayOf(1, 2), result)
    }

    @Test
    fun `returns indices for duplicate values`() {
        val result = solution.solve(intArrayOf(3, 3), 6)

        assertContentEquals(intArrayOf(0, 1), result)
    }

    @Test
    fun `returns indices for negative values`() {
        val result = solution.solve(intArrayOf(-1, -2, -3), -5)

        assertContentEquals(intArrayOf(1, 2), result)
    }
}