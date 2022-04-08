fun main() {
    oddNumbers()
    var name = arrayOfNames(arrayOf("Kimmy", "Bami", "Kim", "Greybami", "Jane"))
    println(name)
    serveDrinks(12)
    serveDrinks(4)
    serveDrinks(19)
    serveDrinks(8)
    numbers()


}

fun oddNumbers() {
    for (num in 1..100)
        if (num % 2 != 0) {
            println(num)
        }
}

fun arrayOfNames(name: Array<String>): Int {
    var sum = 0
    name.forEach { name ->
        if (name.length > 5) {
            sum++
        }

    }
    return sum
}

fun serveDrinks(age: Int) {
    if (age < 6) {
        println("A glass of milk")
    } else if (age < 15 && age > 6) {
        println("A bottle of fanta orange")
    } else {
        println("A bottle of coca cola")
    }
}

fun numbers() {
    for (nums in 1..100)
        if (nums % 3 == 0 && nums % 5 == 0) {
            println("FuzzBuzz")
        } else if (nums % 3 == 0) {
            println("Fuzz")
        } else if (nums % 5 == 0) {
            println("Buzz")
        } else {
            println(nums)
        }
}





    


