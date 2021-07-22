fun isInfiniteProcess(a: Int, b: Int): Boolean {
    if (b < a)
        return true

    return when ((b - a) % 2) {
        0 -> false
        else -> true
    }
}

// Ahmed Mones (9_tay)