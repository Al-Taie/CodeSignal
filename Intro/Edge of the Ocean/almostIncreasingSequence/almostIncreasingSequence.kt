fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var counter: Int = 0
    var previousItem: Int = 0
    var result: Boolean = true

    sequence.forEachIndexed stop@{ index, currentItem ->
        val size: Int = sequence.size - 1
        if (index < size) {
            val nextItem: Int = sequence[index + 1]
            if (currentItem >= nextItem) {
                val isCurrent: Boolean = index == 0 || previousItem < nextItem
                val isNext: Boolean = index + 1 == size || currentItem < sequence[index + 2]

                if (!isCurrent && !isNext) counter++
                counter++
            }
            previousItem = currentItem
            if (counter > 1) {
                result = false
                return@stop
            }
        }
    }
    return result
}

// Ahmed Mones (9_tay)