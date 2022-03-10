package org.example

import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class SecondTest {
    @Test
    fun testA() {
        println("a")
        buf.append("a")
    }

    @Test
    fun testB() {
        println("b")
        buf.append("b")
    }

    @Test
    fun testC() {
        println("c")
        buf.append("c")
    }

    @Test
    fun testD() {
        println("d")
        buf.append("d")
    }

    @Test
    fun testE() {
        println("e")
        buf.append("e")
    }

    companion object {
        private val buf = StringBuffer()

        @AfterAll
        @JvmStatic
        fun assertOrder() {
            val expected = ('a'..'e').reversed().toList().joinToString(separator = "")
            Assertions.assertEquals(expected, buf.toString())
        }
    }
}
