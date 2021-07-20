fun centuryFromYear(year: Int): Int {
    var century: Int = 0
    var yearValue: Int = year

    while (yearValue > 0) {
        yearValue -= 100
        century++
    }
    return century
}

// Ahmed Mones (9_tay)