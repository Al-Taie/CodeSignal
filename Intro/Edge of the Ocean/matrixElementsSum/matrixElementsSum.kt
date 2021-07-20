fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    statues.sort()
    var steps: Int = 0
    for (i in 0 until statues.size - 1) {
        val value: Int = statues[i + 1] - statues[i]
        if (value > 1)
            steps += value - 1
    }
    return steps
}
// Ahmed Al-Taie (9_tay)