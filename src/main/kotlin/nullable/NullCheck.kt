package nullable

class NullCheck {
}

fun main(args: Array<String>) {
    val str: String? = null
    println(str?.length)
    println(str?.length?:0)
}

fun startsWithA1(str: String?): Boolean {
    if(str == null)
        throw java.lang.IllegalArgumentException("null")
    return str.startsWith("A")
}

fun startsWithA1K(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null")
}

fun startsWithA2(str: String?): Boolean? {
    if(str == null)
        return null
    return str.startsWith("A")
}

fun startsWithA2K(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    if(str == null)
        return false
    return str.startsWith("A")
}

fun startsWithA3K(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

//이건 피하는게 좋을 듯
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}