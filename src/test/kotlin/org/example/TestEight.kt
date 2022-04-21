package org.example

import org.junit.jupiter.api.Test

internal class TestEight {
    @Test fun testA() = failWithProb(0.0)
    @Test fun testB() = failWithProb(0.15)
    @Test fun testJ() = failWithProb(0.9)
    @Test fun testK() = failWithProb(1.0)
}
