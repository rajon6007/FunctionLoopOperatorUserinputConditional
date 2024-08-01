package Loop

fun main(){
var first = 0
var second = 1
var next = 0

     for(i in 0..9){
         println("$first")


    next = first + second
         first = second
         second = next

}

}

