fun arrayMaximalAdjacentDifference(arr: MutableList<Int>): Int {
    var diff = 0
    for (i in 1 until arr.size)
        if (Math.abs(arr[i] - arr[i - 1]) >= diff)
            diff = Math.abs(arr[i] - arr[i - 1])
    return diff
}

// Ahmed Mones (9_tay)