package training.hashmap

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class ContainsDuplicateTest {
    val containsDuplicate = ContainsDuplicate()

    @Test
    fun `input empty`() {
        // given
        val input = intArrayOf()
        // when
        val output = containsDuplicate.solve(input)
        // then
        Assertions.assertFalse(output)
    }

    @Test
    fun `input only one element`() {
        // given
        val input = intArrayOf(1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        Assertions.assertFalse(output)
    }

    @Test
    fun `input no duplicates`() {
        // given
        val input = intArrayOf(1, 2, 3, 4)
        // when
        val output = containsDuplicate.solve(input)
        // then
        Assertions.assertFalse(output)
    }

    @Test
    fun `exactly one duplicated element`() {
        // given
        val input = intArrayOf(1, 1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        Assertions.assertTrue(output)
    }

    @Test
    fun `duplicated element at end of the input`() {
        // given
        val input = intArrayOf(1, 2, 3, 4, 1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        Assertions.assertTrue(output)
    }

    @Test
    fun `input with negative integers no duplicates`() {
        // given
        val input = intArrayOf(-1, -2, -3, -4, 1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        Assertions.assertFalse(output)
    }

    @Test
    fun `input with negative integers one duplicate`() {
        // given
        val input = intArrayOf(-1, -2, -3, -4, -1)
        // when
        val output = containsDuplicate.solve(input)
        // then
        Assertions.assertTrue(output)
    }
}