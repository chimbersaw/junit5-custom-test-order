package org.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

internal class FirstTest {
    private val failTests = listOf("testOne", "testFour", "testEight")

    @Test
    fun testZero() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(0)
    }

    @Test
    fun testOne() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(1)
    }

    @Test
    fun testTwo() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(2)
    }

    @Test
    fun testThree() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(3)
    }

    @Test
    fun testFour() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(4)
    }

    @Test
    fun testFive() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(5)
    }

    @Test
    fun testSix() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(6)
    }

    @Test
    fun testSeven() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(7)
    }

    @Test
    fun testEight() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(8)
    }

    @Test
    fun testNine() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println(9)
    }
}
