package org.example

import org.junit.jupiter.api.MethodDescriptor
import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.MethodOrdererContext

class CustomOrder : MethodOrderer {
    override fun orderMethods(context: MethodOrdererContext) {
        context.methodDescriptors.sortWith(comparator)
    }

    private val comparator = Comparator<MethodDescriptor> { m1, m2 ->
        val name1 = m1.method.name.substring(4)
        val name2 = m2.method.name.substring(4)

        val index1 = config.indexOf(name1)
        val index2 = config.indexOf(name2)

        if (index1 == -1 || index2 == -1) throw AssertionError()

        index1 - index2
    }

    private val config = listOf(
        "E", "D", "C", "B", "A",
        "One", "Four", "Eight", "Zero", "Two", "Three", "Five", "Six", "Seven", "Nine"
    )
}
