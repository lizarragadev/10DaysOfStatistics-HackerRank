import java.io.PrintWriter

/**
 * Tutorials > 10 Days of Statistics > Day 1: Quartiles
 *
 * https://www.hackerrank.com/challenges/s10-quartiles/
 * @author lizarragadev
 *
 */

fun main() {
    _writer.day01Quartiles()
    _writer.flush()
}

fun PrintWriter.day01Quartiles() {
    val n = readInt()
    val arr = readIntArray(n)
    arr.sort()
    if(arr.size % 2 == 0) {
        println(median(arr, 0, (arr.size - 1) / 2))
        println(median(arr, 0, arr.size - 1))
        println(median(arr, arr.size / 2, arr.size - 1))
    } else {
        println(median(arr, 0, arr.size / 2 - 1))
        println(median(arr, 0, arr.size - 1))
        println(median(arr, arr.size / 2 + 1, arr.size - 1))
    }
}

fun median(arr: IntArray, start: Int, end: Int): Int {
    return if((start + end + 1) % 2 == 0) {
        (arr[(start + end) / 2] + arr[(start + end) / 2 + 1]) / 2
    } else {
        arr[(start + end) / 2]
    }
}