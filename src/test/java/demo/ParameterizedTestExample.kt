package demo

import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.ValueSource
import java.time.LocalDate
import java.util.concurrent.TimeUnit

class ParameterizedTestExample {

    @ParameterizedTest
    @ValueSource(strings = ["2002-01-23", "1956-03-14", "1503-07-19"])
    fun `Check date in past`(date: LocalDate) {
        assertTrue(date.isBefore(LocalDate.now()))
    }

    @ParameterizedTest
    @EnumSource(TimeUnit::class)
    fun `Test enum`(timeUnit: TimeUnit) {
        assertNotNull(timeUnit)
    }

    @ParameterizedTest
    @EnumSource(TimeUnit::class, mode = EnumSource.Mode.EXCLUDE, names = ["SECONDS", "MINUTES"])
    fun `Test enum without days and milliseconds`(timeUnit: TimeUnit) {
        assertNotNull(timeUnit)
    }
}