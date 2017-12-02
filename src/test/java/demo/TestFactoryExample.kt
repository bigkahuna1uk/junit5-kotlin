package demo

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.TestFactory
import java.time.LocalDate

class TestFactoryExample {

    @TestFactory
    fun `Run multiple tests`(): Collection<DynamicTest> {
        val persons = listOf(
                Person("John", "Doe", LocalDate.of(1969, 5, 20)),
                Person("Jane", "Smith", LocalDate.of(1997, 11, 21)),
                Person("Ivan", "Ivanov", LocalDate.of(1994, 2, 12))
        )

        val minAgeFilter = 18
        return persons.map {
            dynamicTest("Check person $it on age greater or equals $minAgeFilter") {
                assertTrue(it.age >= minAgeFilter)
            }
        }.toList()
    }
}