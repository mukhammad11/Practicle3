import java.util.logging.XMLFormatter
import kotlin.math.*
import kotlin.random.Random
fun main(args: Array<String>) {
    //Задание 1
    val myAge = 18
    val isTeenager = myAge > 13 && myAge < 19
    //Конец 1 задания

    //Задание 2
    val theirAge = 30
    val bothTeenagers = isTeenager && (theirAge > 13 && theirAge < 19)
    //Конец 2 задания

    //Задание 3
    val reader = "Mykhammad"
    val author = "Richard Lucas"
    val authorlsReader = reader == author
    //Конец 3 задания

    //Задание 4
    val readerBeforeAuthor = reader > author
    //Конец 4 задания

    //Задание 5
    val myAge2 = 18
    if (myAge2 > 13 && myAge2 < 19)
        println("Подросток")
    else
        println("Не подросток")
    //Конец 5 задания

    //Задание 6
    val answer: String
    if (myAge2 > 13 && myAge2 < 19)
        answer = "Подросток"
    else answer = "Не подросток"
    println(answer)
    //Конец 6 задания

    //Задание 7
    var counter = 0
    while (counter < 10) {
        print("counter равен $counter")
        counter++
    }
    //Конец 7 задания

    //Задание 8
    counter = 0
    var roll = 0
    do {
        roll = (0..5).random()
        counter++
        println("После $counter бросков roll равен $roll")
    }  while (roll != 0)
    //Конец 8 задания

    //Задание 9
    val range = 1..10
    for (i in range)
        println(" " + i.toDouble().pow(2.0))
    //Конец 9 задания

    //Задание 10
    println()
    for (i in range)
        println(" " + sqrt(i.toDouble()))
    println()
    //Конец 10 задания

    //Задание 11
    var sum = 0
    for (row in 1 until 8 step 2) {
        /*if (row % 2 == 0)
            continue*/
        for (column in 0 until 8)
            sum+= row * column

    }
    println(sum)
    //Конец 11 задания
}

