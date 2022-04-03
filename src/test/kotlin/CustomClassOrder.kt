package org.jetbrains.teamcity.testPrioritization

import org.junit.jupiter.api.ClassOrderer
import org.junit.jupiter.api.ClassOrdererContext

class CustomClassOrder : ClassOrderer {
    private val config = listOf(
        "org.example.SecondTest",
        "org.example.FirstTest"
    )

    private val priority = config.mapIndexed { i, name -> name to i }.toMap()

    override fun orderClasses(context: ClassOrdererContext) = context.classDescriptors.sortBy {
        priority.getOrDefault(it.testClass.name, -1)
    }
}
