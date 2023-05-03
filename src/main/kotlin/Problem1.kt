fun main(args: Array<String>) {
    val n = 1000
    val nr: MutableList<Int> = mutableListOf()
    var sum = 0

    for (i in 1 until n) {
        if (i % 3 == 0 || i % 5 == 0) {
            nr.add(i)
        }
    }

    for (i in nr)
        sum += i

    println(sum)
}