package demo

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Override class name")
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
}
