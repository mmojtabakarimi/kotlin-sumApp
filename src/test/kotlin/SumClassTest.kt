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

    @Test
    fun makeDigitStringToNumberStringTest() {
        val expected = "5+1+2+9+3+0+7="
        assertEquals(expected, sumTest.makeDigitStringToNumberString("five-One-two-Nine-Three-Zero-seven"))
    }
}