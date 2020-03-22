package com.fishercoder;

import com.fishercoder.solutions._1392;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1392Test {

    private static _1392.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1392.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("l", solution1.longestPrefix("level"));
    }

    @Test
    public void test2() {
        assertEquals("abab", solution1.longestPrefix("ababab"));
    }

    @Test
    public void test3() {
        assertEquals("leet", solution1.longestPrefix("leetcodeleet"));
    }

    @Test
    public void test4() {
        assertEquals("", solution1.longestPrefix("a"));
    }

    @Test
    public void test5() {
        assertEquals("aaaa", solution1.longestPrefix("aaaaa"));
    }

    @Test
    public void test6() {
        assertEquals("", solution1.longestPrefix("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"));
    }

}