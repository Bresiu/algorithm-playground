package training.hashmap

import kotlin.test.Test
import kotlin.test.assertEquals

class GroupAnagramsTest {
    private val groupAnagrams = GroupAnagrams()

    @Test
    fun `empty input array produces empty output array`() {
        // given
        val empty = emptyArray<String>()
        // when
        val output = groupAnagrams.solve(empty)
        // then
        assertEquals(0, output.size)
    }

    @Test
    fun `one element in input array produces one element in output array`() {
        // given
        val input = arrayOf("abc")
        // when
        val output = groupAnagrams.solve(input)
        // then
        assertEquals(1, output.size)
        assertEquals(input[0], output[0][0])
    }

    @Test
    fun `input with multiple anagrams produces nested output array`() {
        // given
        val input = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
        // when
        val output = groupAnagrams.solve(input)
        // then
        val expected = listOf(
            listOf("ate", "eat", "tea"),
            listOf("nat", "tan"),
            listOf("bat"),
        ).map { it.sorted() }
            .sortedBy { it.joinToString("#") }

        val normalized = output
            .map { it.sorted() }
            .sortedBy { it.joinToString("#") }

        assertEquals(expected, normalized)
    }

    @Test
    fun `input with anagrams produces one group output array`() {
        // given
        val input = arrayOf("abc", "abc", "bca")
        // when
        val output = groupAnagrams.solve(input)
        // then
        val expected = listOf(
            listOf("abc", "abc", "bca"),
        ).map { it.sorted() }
            .sortedBy { it.joinToString("#") }

        val normalized = output
            .map { it.sorted() }
            .sortedBy { it.joinToString("#") }

        assertEquals(expected, normalized)
    }
}