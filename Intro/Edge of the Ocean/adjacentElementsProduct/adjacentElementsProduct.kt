fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {
    var temp = 0
    var maxIndex = 0

    for (i in 0 until inputArray.size - 1) {
        val sum = inputArray[i] * inputArray[i + 1]
        temp = if (temp == 0) sum else temp

        if (sum > temp) {
            temp = sum
            maxIndex = i
        }
    }
    return inputArray[maxIndex] * inputArray[maxIndex + 1]
}

// Ahmed Mones (9_tay)