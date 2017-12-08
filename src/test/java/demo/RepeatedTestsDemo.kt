package demo

import org.junit.jupiter.api.RepeatedTest

class RepeatedTestsDemo {

    @RepeatedTest(10, name = "{displayName} {currentRepetition} из {totalRepetitions}")
    fun `Повторяемый тест`() {

    }
}