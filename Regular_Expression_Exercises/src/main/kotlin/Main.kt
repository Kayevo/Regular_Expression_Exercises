fun main(args: Array<String>) {
    // Verify if string value initiate with "a" lower or upper case.
    val valueA = "bacross"
    println(initWithA(valueA));

    val valueB = "Across"
    println(initWithA(valueB));
}

fun initWithA(_values: String): Boolean{
    var pattern = Regex("^a|^A");
    var result = pattern.containsMatchIn(_values);

    return  result
}