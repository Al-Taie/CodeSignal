fun firstDigit(str: String): Char {
    for (ch in str) {
        if (ch.isDigit()) return ch
    }
    return ' '
}
// Ahmed Mones (9_tay)