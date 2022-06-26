fun main(args: Array<String>) {
    // Verify if string value initiate with "a" lower or upper case.
    val valueA = "bacross"
    println(initWithA(valueA));

    val valueB = "across"
    println(initWithA(valueB));

    val valueC = "12123451234"
    println(verifyPhoneNum(valueC))

    val valueD = "12923451234"
    println(verifyPhoneNum(valueD))
}

fun initWithA(_values: String): Boolean{
    var pattern = Regex("^a|^A");
    var result = pattern.containsMatchIn(_values);

    return  result
}

// ignore sensitive case
fun initWithANoSensCase(_values: String): Boolean{
    var pattern = "^A".toRegex(RegexOption.IGNORE_CASE)
    var result = pattern.containsMatchIn(_values);

    return  result
}

fun verifyPhoneNum(phoneNum: String): Boolean{
    var validPhoneNum = false

    val pattern = Regex("[0-9]{2}9[0-9]{8}")
    validPhoneNum = pattern.matches(phoneNum)

    return validPhoneNum
}