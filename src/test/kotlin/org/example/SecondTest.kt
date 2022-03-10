package org.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail

internal class SecondTest {
    private val failTests = listOf("testE", "testD", "testC")

    @Test
    fun testA() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println("a")
    }

    @Test
    fun testB() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println("b")
    }

    @Test
    fun testC() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println("c")
    }

    @Test
    fun testD() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println("d")
    }

    @Test
    fun testE() {
        if (failTests.contains(object {}.javaClass.enclosingMethod.name)) fail("(")
        println("e")
    }
}
