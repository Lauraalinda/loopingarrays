fun main(){
   var s=pofelements(arrayOf(23,93,7,2))
    println(s)
    var d=decimalelements(arrayOf("hello",45.0,89,23.0F,true,9.0,56,32.0F))
    println(d)
    var v=vowels(arrayOf('a','b','e','o','i','k','u'))
    println(v)


}
fun pofelements(numbers:Array<Int>):Int{
    var product=1
     numbers.forEach{number->
         product*=number
     }
    return product
}
fun decimalelements(statement:Array<Any>):Double{
    var sum=0.0
    statement.forEach{x->
        if (x is Float || x is Double)
        sum+=x.toString().toDouble()

    }
    return sum
}

fun vowels(letters:Array<Char>):Int {
    var y= 0
    letters.forEach{letter->
        if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u')
           y++
        }
    return y
}



