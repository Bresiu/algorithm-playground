package training.twopointers

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidPalindromeTest {
    private val validPalindrome = ValidPalindrome()

    @Test
    fun `empty alphanumeric input is a palindrome` () {
        // given
        val s = ""
        // when
        val output = validPalindrome.solve(s)
        // then
        assertTrue(output)
    }

    @Test
    fun `input with one letter and random signa is a palindrome` () {
        // given
        val s = "a,."
        // when
        val output = validPalindrome.solve(s)
        // then
        assertTrue(output)
    }

    @Test
    fun `palindrome solve is case insensitive` () {
        // given
        val s = "a,A."
        // when
        val output = validPalindrome.solve(s)
        // then
        assertTrue(output)
    }

    @Test
    fun `not a palindrome should return false` () {
        // given
        val s = "aBb."
        // when
        val output = validPalindrome.solve(s)
        // then
        assertFalse(output)
    }

    @Test
    fun `complex palindrome problem` () {
        // given
        val s = "A man, a plan, a canal: Panama"
        // when
        val output = validPalindrome.solve(s)
        // then
        assertTrue(output)
    }
}