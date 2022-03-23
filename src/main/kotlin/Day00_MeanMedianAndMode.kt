import java.util.Collections

/**
 * Tutorials > 10 Days of Statistics > Day 0: Mean, Median and Mode
 *
 * https://www.hackerrank.com/challenges/s10-basic-statistics/
 * @author lizarragadev
 *
 */

fun main() {
    val n = readInt()
    val x = readInts(n)
    val orderList = x.sorted()
    println(String.format("%.1f", mean(orderList)).toDouble())
    println(String.format("%.1f", median(orderList)).toDouble())
    println(mode(orderList))
}

fun mean(list: List<Int>): Double {
    var sum = 0.0
    list.forEach {
        sum += it
    }
    return (sum/list.size)
}

fun median(list: List<Int>): Double {
    return if(list.size.rem(2) == 0) {
        ((list[(list.size/2) - 1] + list[(list.size/2)])/2.0)
    } else {
        list[(list.size / 2)].toDouble()
    }
}

fun mode(list: List<Int>): Int {
    var max = Integer.MIN_VALUE
    var ind = -1
    list.forEachIndexed { index, x ->
        val count = Collections.frequency(list, x)
        if (count > max) {
            max = count
            ind = index
        }
    }
    return list[ind]
}