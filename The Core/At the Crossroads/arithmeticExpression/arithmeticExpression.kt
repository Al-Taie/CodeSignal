fun arithmeticExpression(a: Int, b: Int, c: Int): Boolean {
    val result = when (c) {
        a - b -> true
        a + b -> true
        a * b -> true
        else -> false
    }
    if (result || (a % b == 0 && a / b == c)) return true
    return false
}
// Ahmed Mones (9_tay)