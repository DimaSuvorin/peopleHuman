fun main(){
    println("Hello Kotlin!")
    val likes = 11

    var result = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"

    println("Понравилось $likes $result")

}