fun main() {
    var inLuv = loveCaller(4,4)
    println("Are they in love? $inLuv")

    inLuv = loveCaller(3,11)
    println("Are they in love? $inLuv")

    inLuv = loveCaller(22,17)
    println("Are they in love? $inLuv")


    println()
    println("Using lover function")
    lover(4,4)
    lover(3,11)
    lover(22,17)


}

fun loveCaller(lovebird1: Int, lovebird2: Int): Boolean{
    return(lovebird1 % 2 != lovebird2 % 2)
}

fun lover(lovebird1: Int, lovebird2: Int){
    var result = if(lovebird1 % 2 != lovebird2 % 2){
        println("true")
    }else{
        println("false")
    }
}