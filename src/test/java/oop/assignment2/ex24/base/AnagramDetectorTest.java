package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_anagrams1() {
        //given
        AnagramDetector anagramDetector = new AnagramDetector("note", "tone");

        //when
        boolean expected = true;
        boolean actual = anagramDetector.isAnagram();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams2() {
        //given
        AnagramDetector anagramDetector = new AnagramDetector("NOTE", "tone");

        //when
        boolean expected = true;
        boolean actual = anagramDetector.isAnagram();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_true_for_anagrams3() {
        //given
        AnagramDetector anagramDetector = new AnagramDetector("name", "mean");

        //when
        boolean expected = true;
        boolean actual = anagramDetector.isAnagram();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams1() {
        //given
        AnagramDetector anagramDetector = new AnagramDetector("nice", "tone");

        //when
        boolean expected = false;
        boolean actual = anagramDetector.isAnagram();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams2() {
        //given
        AnagramDetector anagramDetector = new AnagramDetector("notes", "tone");

        //when
        boolean expected = false;
        boolean actual = anagramDetector.isAnagram();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams3() {
        //given
        AnagramDetector anagramDetector = new AnagramDetector("NOTES", "tone");

        //when
        boolean expected = false;
        boolean actual = anagramDetector.isAnagram();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void isAnagram_returns_false_for_nonanagrams4() {
        //given
        AnagramDetector anagramDetector = new AnagramDetector("ton", "tone");

        //when
        boolean expected = false;
        boolean actual = anagramDetector.isAnagram();

        //then
        assertEquals(expected, actual);
    }
}