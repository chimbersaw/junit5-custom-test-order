package org.example

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FirstTest {
    @Test
    fun testZero() {
        println(0)
        buf.add(0)
    }

    @Test
    fun testOne() {
        println(1)
        buf.add(1)
    }

    @Test
    fun testTwo() {
        println(2)
        buf.add(2)
    }

    @Test
    fun testThree() {
        println(3)
        buf.add(3)
    }

    @Test
    fun testFour() {
        println(4)
        buf.add(4)
    }

    @Test
    fun testFive() {
        println(5)
        buf.add(5)
    }

    @Test
    fun testSix() {
        println(6)
        buf.add(6)
    }

    @Test
    fun testSeven() {
        println(7)
        buf.add(7)
    }

    @Test
    fun testEight() {
        println(8)
        buf.add(8)
    }

    @Test
    fun testNine() {
        println(9)
        buf.add(9)
    }

    companion object {
        private val buf = mutableListOf<Int>()

        @AfterAll
        @JvmStatic
        fun assertOrder() {
            val expected = 0..9
            assertEquals(expected.toList(), buf)
        }
    }
}
