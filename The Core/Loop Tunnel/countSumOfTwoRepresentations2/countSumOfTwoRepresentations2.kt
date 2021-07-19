fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    if (2 * r < n || 2 * l > n) return 0
    val min = maxOf(l, n - r)
    val max = minOf(r, n - l)
    val mid = (max + min) / 2
    return mid - min + 1
}
// Ahmed Mones (9_tay)