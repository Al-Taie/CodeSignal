fun metroCard(lastNumberOfDays: Int): MutableList<Int> {
    return if (lastNumberOfDays == 31) mutableListOf(28, 30, 31) else mutableListOf(31)
}

// Ahmed Al-Taie (9_tay)