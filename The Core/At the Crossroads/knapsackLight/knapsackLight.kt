fun knapsackLight(value1: Int, weight1: Int, value2: Int, weight2: Int, maxW: Int): Int {
    if (weight1 + weight2 <= maxW)
        return value1 + value2
    else if (weight1 > maxW && weight2 > maxW)
        return 0
    else if (weight1 <= maxW && weight2 > maxW)
        return value1
    else if (weight2 <= maxW && weight1 > maxW)
        return value2
    else if (value1 >= value2)
        return value1
    else
        return value2
}
// Ahmed Mones (9_tay)