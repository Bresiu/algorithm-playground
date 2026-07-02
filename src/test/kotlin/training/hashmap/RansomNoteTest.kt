package training.hashmap

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RansomNoteTest {
    private val ransomNote = RansomNote()

    @Test
    fun `magazine length is shorter than ransomNote`() {
        // given
        val ransomNote = "ab"
        val magazine = "a"
        // when
        val canCreateRansomNote = this.ransomNote.solve(ransomNote, magazine)
        assertFalse(canCreateRansomNote)
    }

    @Test
    fun `magazine length is longer than ransomNote but contains different characters`() {
        // given
        val ransomNote = "de"
        val magazine = "abc"
        // when
        val canCreateRansomNote = this.ransomNote.solve(ransomNote, magazine)
        assertFalse(canCreateRansomNote)
    }

    @Test
    fun `magazine uses same characters as ransom note`() {
        // given
        val ransomNote = "abc"
        val magazine = "abc"
        // when
        val canCreateRansomNote = this.ransomNote.solve(ransomNote, magazine)
        assertTrue(canCreateRansomNote)
    }

    @Test
    fun `magazine contains all characters from ransom note plus additional ones`() {
        // given
        val ransomNote = "abc"
        val magazine = "abcde"
        // when
        val canCreateRansomNote = this.ransomNote.solve(ransomNote, magazine)
        assertTrue(canCreateRansomNote)
    }
}