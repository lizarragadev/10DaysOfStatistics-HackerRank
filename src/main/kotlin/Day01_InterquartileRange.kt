import java.io.PrintWriter

/**
 * Tutorials > 10 Days of Statistics > Day 1: Interquartile Range
 *
 * https://www.hackerrank.com/challenges/s10-interquartile-range/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.day01Range()
    _writer.flush()
}

fun PrintWriter.day01Range() {
    val n = readInt()
    val values = readIntArray(n)
    val frequency = readIntArray(n)
    val arr = generateArray(values, frequency)
    if(arr.size % 2 == 0) {
        println(getMedian(arr, arr.size / 2, arr.size - 1) - getMedian(arr, 0, (arr.size - 1) / 2))
    } else {
        println(getMedian(arr, arr.size / 2 + 1, arr.size - 1) - getMedian(arr, 0, arr.size / 2 - 1))
    }
}

fun getMedian(arr: MutableList<Int>, start: Int, end: Int): Double {
    return if((start + end + 1) % 2 == 0) {
        (arr[(start + end) / 2] + arr[(start + end) / 2 + 1]).toDouble() / 2
    } else {
        arr[(start + end) / 2].toDouble()
    }
}

fun generateArray(values: IntArray, frequency: IntArray): MutableList<Int> {
    val list = mutableListOf<Int>()
    values.forEachIndexed { index, value ->
        for(i in 1..frequency[index]) {
            list.add(value)
        }
    }
    list.sort()
    return list
}