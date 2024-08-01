package UserInput

import java.util.Scanner

fun main()
{
    var scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()
    var sum = a+b
    var sub = a-b
    var multi = a*b
    var div = a/b.toDouble()
    var mod = a%b

    println("Sum: $sum")
    println("Sub: $sub")
    println("Multi: $multi")
    println("Div: $div")
    println("Mod: $mod")







}
