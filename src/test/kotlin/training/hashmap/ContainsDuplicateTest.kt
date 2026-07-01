package training.hashmap

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateTest {
    private val containsDuplicate = ContainsDuplicate()

    @Test
    fun `input empty`() {
        // given
        val input = intArrayOf()
        // when
        val output = containsDuplicate.solve(input)
        // then
        assertFalse(output)
    }

    @Test
    fun `input only one element`() {
        // given
        val input = intArrayOf(1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        assertFalse(output)
    }

    @Test
    fun `input no duplicates`() {
        // given
        val input = intArrayOf(1, 2, 3, 4)
        // when
        val output = containsDuplicate.solve(input)
        // then
        assertFalse(output)
    }

    @Test
    fun `exactly one duplicated element`() {
        // given
        val input = intArrayOf(1, 1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        assertTrue(output)
    }

    @Test
    fun `duplicated element at end of the input`() {
        // given
        val input = intArrayOf(1, 2, 3, 4, 1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        assertTrue(output)
    }

    @Test
    fun `input with negative integers no duplicates`() {
        // given
        val input = intArrayOf(-1, -2, -3, -4, 1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        assertFalse(output)
    }

    @Test
    fun `input with negative integers one duplicate`() {
        // given
        val input = intArrayOf(-1, -2, -3, -4, -1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        assertTrue(output)
    }
}