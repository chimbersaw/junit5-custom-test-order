package org.jetbrains.teamcity.testPrioritization

import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.MethodOrdererContext

class CustomOrder : MethodOrderer {
    private val config = listOf(
        "E", "D", "C", "B", "A"
    ).map { "org.example.SecondTest.test$it" } + listOf(
        "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    ).map { "org.example.FirstTest.test$it" }

    private val priority = config.mapIndexed { i, name -> name to i }.toMap()

    override fun orderMethods(context: MethodOrdererContext) =
        context.methodDescriptors.sortBy {
            val name = "${it.method.declaringClass.name}.${it.method.name}"
            priority.getOrDefault(name, -1)
        }
}
