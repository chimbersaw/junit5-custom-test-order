package org.example

import org.junit.jupiter.api.ClassDescriptor
import org.junit.jupiter.api.ClassOrderer
import org.junit.jupiter.api.ClassOrdererContext

class CustomClassOrder : ClassOrderer {
    override fun orderClasses(context: ClassOrdererContext) {
        context.classDescriptors.sortWith(comparator)
    }

    private val comparator = Comparator<ClassDescriptor> { c1, c2 ->
        val name1 = c1.testClass.name
        val name2 = c2.testClass.name

        val index1 = config.indexOf(name1)
        val index2 = config.indexOf(name2)

        if (index1 == -1 || index2 == -1) throw AssertionError()

        index1 - index2
    }

    private val config = listOf(
        "org.example.SecondTest",
        "org.example.FirstTest"
    )
}
