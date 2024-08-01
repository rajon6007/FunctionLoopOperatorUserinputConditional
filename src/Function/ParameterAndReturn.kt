package Function

fun main(){
    println(sum3(10,20))
    var r = sum3(30,60)
    println(r)

    var add = 20 + sum3(50,20)
    println(add)

}

fun sum3(a:Int, b:Int):Int{
    var sum = a+b
    return sum

}