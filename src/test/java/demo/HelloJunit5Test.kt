package demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

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
        Assertions.assertEquals("a", "a")
        Assertions.assertEquals(2, 1 + 1, "Optional message")
        Assertions.assertEquals(2, 1 + 1, { "Assertion message " + "can be lazily evaluated" })
    }
}
