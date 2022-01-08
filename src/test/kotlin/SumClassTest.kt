import kotlin.test.Test
import kotlin.test.assertEquals

internal class SumClassTest {
    private val sumTest: SumClass = SumClass()

    @Test
    fun sumInputTest() {
        val expected = 8
        assertEquals(expected, sumTest.sumInput("five-One-two"))
    }

    @Test
    fun sumInputInvalidStringTest() {
        val expected = 8
        assertEquals(expected, sumTest.sumInput("five-One-eeee-two-tttt-0"))
    }
}