class ArrayFunciones(val arrayfun: Array<Int>) {

    fun sumaNumerosArray(): Int = arrayfun.sum()

    fun numeroMayor(): Int? = arrayfun.maxOrNull()

    fun numeroMenor():Int? = arrayfun.minOrNull()

    fun ordenar():Array<Int> = arrayfun.sortedArray()

}