fun main() {
    var inputDigitString: String = "five-One-two-Nine-Three-Zero-seven"
    val sumApp = SumClass()

    println(
        "The Result will be: ${sumApp.makeDigitStringToNumberString(inputDigitString)}${
            sumApp.sumInput(
                inputDigitString
            )
        }"
    )

    inputDigitString = "Six-rr-five-One-two-Nine-Three-Zero-seven"
    println(
        "The Result will be: ${sumApp.makeDigitStringToNumberString(inputDigitString)}${
            sumApp.sumInput(
                inputDigitString
            )
        }"
    )

    inputDigitString = "One-Alll-Four-Three-Zero-seven-Six-1-2-five-Oneone-two@%%-Nine:-Three-Zero-seven"
    println(
        "The Result will be: ${sumApp.makeDigitStringToNumberString(inputDigitString)}${
            sumApp.sumInput(
                inputDigitString
            )
        }"
    )

}