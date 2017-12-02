package demo

import org.junit.jupiter.api.Assertions.assertTimeout
import org.junit.jupiter.api.Assertions.assertTimeoutPreemptively
import org.junit.jupiter.api.Test
import java.time.Duration.ofMillis

class TimeoutTest {

    @Test
    fun `Timeout not exceeded`() {
        assertTimeout(ofMillis(1000)) {
            print("Выполняется операция, которая займёт не больше 1 секунды")
            Thread.sleep(3)
        }
    }

    @Test
    fun `Timeout not exceeded with preemptively exit`() {
        // Тест упадёт, как только время выполнения превысит 1000 мс
        assertTimeoutPreemptively(ofMillis(1000)) {
            print("Выполняется операция, которая займёт не больше 1 секунды")
            Thread.sleep(3)
        }
    }
}