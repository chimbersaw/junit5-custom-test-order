package org.example

import org.junit.jupiter.api.Test

// sum = 0.6
internal class TestOne {
    @Test fun testA() = failWithProb(0.0)
    @Test fun testB() = failWithProb(0.1)
    @Test fun testC() = failWithProb(0.2)
    @Test fun testD() = failWithProb(0.3)
}
