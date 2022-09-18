val seconds = 18000

val minute = seconds/60

val hour = minute/60

fun howMuchMinutes (seconds: Int) : String = when {
    minute % 10 == 1 -> " минуту назад."
    minute % 10 == 2 || seconds/60 % 10 == 3 || seconds % 10 == 4 -> " минуты назад."
    else -> " минут назад."

}
fun howMuchHours (seconds: Int) : String = when {
    hour % 10 == 1 -> " час назад."
    hour % 10 == 2 || hour % 10 == 3 || hour % 10 == 4 -> " часа назад."
    else -> " часов назад."
}

fun agoToText() = when {
    seconds in 0..60 -> println("Был(а) в сети только что.")
    seconds in 60..60*60 -> println("Был(а) в сети " + minute + howMuchMinutes(seconds))
    seconds in 60*60 + 1 .. 24*60*60 -> println("Был(а) в сети " + hour + howMuchHours(seconds))
    seconds in 24*60*60+1..48*60*60 -> println("Был(а) в сети вчера")
    seconds in 48*60*6+1 .. 72*60*60 -> println("Был(а) в сети позавчера")
    seconds > 72*60*60 -> println("Был(а) в сети давно")
    else -> println("Вообще не приходил")
}

fun main() {
    agoToText()

}