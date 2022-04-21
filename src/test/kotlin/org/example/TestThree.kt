package org.example

import org.junit.jupiter.api.Test

internal class TestThree {
    @Test fun testA() = failWithProb(0.239)
    @Test fun testB() = failWithProb(0.65)
    @Test fun testC() = failWithProb(0.89)
    @Test fun testD() = failWithProb(0.11)
    @Test fun testE() = failWithProb(0.05)
    @Test fun testF() = failWithProb(0.95)
}
