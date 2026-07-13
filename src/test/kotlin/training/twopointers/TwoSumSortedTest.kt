package training.twopointers

import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class TwoSumSortedTest {
    private val twoSumSorted = TwoSumSorted()

    @Test
    fun `no solution throws exception`() {
        // given
        val input = intArrayOf(0, 1)
        val target = 0
        // when
        val exception = assertThrows<IllegalStateException> {
            twoSumSorted.solve(input, target)
        }
        // then
        assertEquals("No solution found", exception.message)
    }

    @Test
    fun `two elements sums to target`() {
        // given
        val input = intArrayOf(1, 1)
        val target = 2
        // when
        val output = twoSumSorted.solve(input, target)
        // then
        assertContentEquals(intArrayOf(1, 2), output)
    }

    @Test
    fun `three elements, extreme elements sums to target - no shifts`() {
        // given
        val input = intArrayOf(1, 2, 3)
        val target = 4
        // when
        val output = twoSumSorted.solve(input, target)
        // then
        assertContentEquals(intArrayOf(1, 3), output)
    }

    @Test
    fun `three elements, left needs to shift`() {
        // given
        val input = intArrayOf(1, 2, 3)
        val target = 5
        // when
        val output = twoSumSorted.solve(input, target)
        // then
        assertContentEquals(intArrayOf(2, 3), output)
    }

    @Test
    fun `three elements, right needs to shift`() {
        // given
        val input = intArrayOf(1, 2, 3)
        val target = 3
        // when
        val output = twoSumSorted.solve(input, target)
        // then
        assertContentEquals(intArrayOf(1, 2), output)
    }
}