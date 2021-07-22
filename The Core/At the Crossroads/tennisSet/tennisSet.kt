fun tennisSet(score1: Int, score2: Int): Boolean {
    val min: Int = minOf(score1, score2)
    val max: Int = maxOf(score1, score2)
    val p = listOf(5, 6)

    if (max == 6 && min < 5)
        return true
    else if (max == 7 && p.contains(min))
        return true

    return false

}

// Ahmed Mones (9_tay)