package org.example

import org.junit.jupiter.api.Test

// sum = 1.6
internal class TestTwo {
    @Test fun testA() = failWithProb(0.7)
    @Test fun testB() = failWithProb(0.5)
    @Test fun testC() = failWithProb(0.3)
    @Test fun testD() = failWithProb(0.1)
}
