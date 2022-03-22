import java.util.Collections

fun main() {
    val n = readInt()
    val x = readInts(n)
    x.sort()
    println(String.format("%.1f", mean(x)).toDouble())
    println(String.format("%.1f", median(x)).toDouble())
    println(mode(x))
}

fun mean(list: MutableList<Int>): Double {
    var sum = 0.0
    list.forEach {
        sum += it
    }
    return (sum/list.size)
}

fun median(list: MutableList<Int>): Double {
    return if(list.size.rem(2) == 0) {
        ((list[(list.size/2) - 1] + list[(list.size/2)])/2.0)
    } else {
        list[(list.size / 2)].toDouble()
    }
}

fun mode(list: MutableList<Int>): Int {
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