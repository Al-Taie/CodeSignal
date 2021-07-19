fun magicalWell(a: Int, b: Int, n: Int): Int {
    var cost = 0
    var A = a
    var B = b
    for (i in 1..n) {
        cost += A*B
        A++; B++
    }
    return cost
}
// Ahmed Mones (9_tay)