package demo

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import java.time.LocalDate

class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(strings = ["2002-01-23", "1956-03-14", "1503-07-19"])
    fun `Check date in past`(date: LocalDate) {
        assertTrue(date.isBefore(LocalDate.now()))
    }
}