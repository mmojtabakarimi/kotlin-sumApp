import kotlinx.serialization.Serializable
import java.util.stream.Collectors

class SumClass {
    @Serializable
    data class Digit(val name: String, val value: Int)

    private val digitMap = listOf(
        Digit("One", 1),
        Digit("Two", 2),
        Digit("Three", 3),
        Digit("Four", 4),
        Digit("Five", 5),
        Digit("Six", 6),
        Digit("Seven", 7),
        Digit("Eight", 8),
        Digit("Nine", 9),
        Digit("Zero", 0)
    )

    public fun sumInput(stringNumber: String): Int {
        var digitStringList: List<String> = stringNumber.split("-")
        var result:Int = 0
        digitMap.forEach {
            result += checkDigitMap(it, digitStringList)
        }
        return result
    }

    private fun checkDigitMap(digitString: Digit, digits: List<String>): Int {
        var numberOf = digits.filter { it.equals(digitString.name, ignoreCase = true) }
        return numberOf.count() * digitString.value
    }

    public fun makeDigitStringToNumberString(stringNumber: String): String {
        var digitStringList: List<String> = stringNumber.split("-")
        var myList: MutableList<String> = mutableListOf<String>()

        digitStringList.forEach {
            var res = getDigitStringValue(it)
            if (res != "") {
                myList.add(res)
            }
        }

        var result: String = myList.stream().collect(Collectors.joining("+"))
        return "$result="
    }

    private fun getDigitStringValue(p1: String): String {
        digitMap.forEach {
            if (p1.equals(it.name, ignoreCase = true)) {
                return it.value.toString()
            }
        }
        return ""
    }
}