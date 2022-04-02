fun main(args: Array<String>) {
    val array = arrayOf(1,2,4,5,3,8)
    var objetoArray = ArrayFunciones(array)

    println(objetoArray.sumaNumerosArray())
    println(objetoArray.numeroMayor())
    println(objetoArray.ordenar().contentToString())
    println(objetoArray.numeroMenor())
}