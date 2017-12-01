package demo

import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable

class HelloJunit5Test {

    @Test
    fun `First test`() {
        print("Hello, JUnit5!")
    }

    @DisplayName("Override `First test ╯°□°）╯` by ¯\\_(ツ)_/¯")
    @Test
    fun `First test ╯°□°）╯`() {
        print("Hello, JUnit5!")
    }

    @Test
    fun `Base assertions`() {
        assertEquals("a", "a")
        assertEquals(2, 1 + 1, "Optional message")
        assertEquals(2, 1 + 1, { "Assertion message " + "can be lazily evaluated" })
    }

    @Test
    fun `Grouped assertions`() {
        val person = Person("John", "Doe")
        assertAll("person",
                Executable { assertEquals("John", person.firstName) },
                Executable { assertEquals("Doe", person.lastName) }
        )
    }
}
