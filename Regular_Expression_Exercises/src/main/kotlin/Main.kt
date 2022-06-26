fun main(args: Array<String>) {
    // Verify if string value initiate with "a" lower or upper case.
    val valueA = "bacross"
    println(initWithA(valueA));

    val valueB = "across"
    println(initWithA(valueB));
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