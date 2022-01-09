fun main() {
    var inputDigitString: String = "five-One-two-Nine-Three-Zero-seven"
    val sumApp = SumClass()
    //Test normal digit string
    println(
        "${sumApp.makeDigitStringToNumberString(inputDigitString)}${
            sumApp.sumInput(
                inputDigitString
            )
        }"
    )
    //Test string may contain case sensitive digit  string
    inputDigitString = "Six-five-One-two-Nine-Three-Zero-seven"
    println(
        "${sumApp.makeDigitStringToNumberString(inputDigitString)}${
            sumApp.sumInput(
                inputDigitString
            )
        }"
    )
    //Test string may contain anything
    inputDigitString = "One-Alll-Four-Three-Zero-seven-Six-1-2-five-Oneone-two@%%-Nine:-Three-Zero-seven"
    println(
        "${sumApp.makeDigitStringToNumberString(inputDigitString)}${
            sumApp.sumInput(
                inputDigitString
            )
        }"
    )

}