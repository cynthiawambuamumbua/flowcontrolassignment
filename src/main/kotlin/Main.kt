fun main(){
    oddnumbers()
    println( names(arrayOf("Cynthia","Muema","Geoffrey","Samson","Sue")))
    robot(2)
    robot(12)
    robot(18)
    nums(arrayOf())





}
//Create a function that prints out all the odd numbers between 1 and 100 (2pts)

fun oddnumbers(){
        for (nums in 1 ..100){
            if (nums%2!=0)
            println(nums)

    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun names(names:Array<String>):Int{
    var x=0
    for (name in names){
        if (name.length>5){
            x++
        }
    }
    return x
   }


//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of cocacola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.

fun robot(age:Int){
    when (age){
        in 0 ..5-> println("take milk")
        in 6 ..14-> println("serve a bottle of fanta orange")
        else-> println("take bottle of coca cola")

    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun nums(nums:Array<Int>){
    for (num in 1 ..100){
        if (num%3==0)
            println("Fizz")

    }
    for (num in 1 ..100){
        if (num%5==0){
            println("Buzz")
        }
    }
    for (num in 1 ..100){
        if (num%5==num%3){
            println("FizzBuzz")
        }
    }

}



