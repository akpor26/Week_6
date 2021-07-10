fun main() {
    var inLove = loveCalculator(4,4)
    println("Are they in love? $inLove")

    inLove = loveCalculator(3,11)
    println("Are they in love? $inLove")

    inLove = loveCalculator(22,17)
    println("Are they in love? $inLove")

    //tried something different
    println()
    println("Using loveCal function")
    loveCal(4,4)
    loveCal(3,11)
    loveCal(22,17)


}

fun loveCalculator(flower1: Int, flower2: Int): Boolean{
    return(flower1 % 2 != flower2 % 2)
}

fun loveCal(flower1: Int, flower2: Int){
    var result = if(flower1 % 2 != flower2 % 2){
        println("true")
    }else{
        println("false")
    }
}