fun main(args: Array<String>) {
   val animal = Animal().nombre
    print(animal)
}
fun palindromo(string : String): Boolean{
    val reversedString = string.revertRecursive()
    return string.lowercase() == reversedString.lowercase()
}
fun String.revert(): String{
    var index = length-1
    var string = ""
    while (index >= 0 ){
        string+=this[index]
        index--
    }
    return string
}

fun String.revertRecursive(index: Int = lastIndex): String {
    if (index < 0) return ""
    return this[index] + revertRecursive(index - 1)
}
