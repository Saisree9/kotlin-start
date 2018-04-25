var x = 0

fun incrementX() {
    x +=1
}
fun main(args: Array<String>) {
    if (args.size == 0) {
        println("Please provide a name as a command-line argument")
        return
    }
    println("Hello, ${args[0]}!")
    println("Hello world")
    val sum  = add(2,3)
    println(sum)
    incrementX()
    println("x  = ${x}")
    println("args ${args[0]}")
}
