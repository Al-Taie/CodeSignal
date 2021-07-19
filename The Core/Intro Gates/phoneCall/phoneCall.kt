fun phoneCall(min1: Int, min2_10: Int, min11: Int, s: Int): Int {
    val minus = s - min1
    val multi = min2_10 * 9
    if (s < min1) return 0
    var sum = 1
    sum += if (minus > multi) 9 else minus / min2_10
    sum += if ((minus - multi) < 0) 0 else (minus - multi) / min11
    return sum
}

// Ahmed Mones (9_tay)