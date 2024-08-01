package conditional


fun main()
{
    println("enter a year")
    var year = readLine()!!.toInt()


    if (year%400 == 0 || year%100!==0 && year%4==0)
    {
        println("$year is leap year")
    }
    else {
        println("$year is not leap year")

    }


}
