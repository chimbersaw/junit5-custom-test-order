package org.example

import org.junit.jupiter.api.fail
import kotlin.random.Random

fun failWithProb(prob: Double) {
    if (Random.nextDouble() < prob) fail("")
}

