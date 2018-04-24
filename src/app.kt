var x = 0

fun incrementX() {
    x +=1
}
fun main(args: Array<String>) {
    println("Hello world")
    val sum  = add(2,3)
    println(sum)
    incrementX()
    println("x  = ${x}")
}
