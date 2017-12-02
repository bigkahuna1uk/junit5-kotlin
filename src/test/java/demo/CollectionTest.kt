package demo

import org.hamcrest.Matchers.containsInAnyOrder
import org.hamcrest.junit.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class CollectionTest {

    @Test
    fun `Check collection contains`() {
        val list = listOf("s1", "s2", "s3")
        assertThat(list, containsInAnyOrder("s3", "s1", "s2"))
    }
}