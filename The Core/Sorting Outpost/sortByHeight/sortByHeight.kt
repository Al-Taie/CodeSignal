fun sortByHeight(a: MutableList<Int>): MutableList<Int> {
    val list = a.filter { it != -1 }.sorted().toMutableList()
    a.forEachIndexed { i, v -> if (v == -1) list.add(i, v) }
    return list
}

// Ahmed Mones (9_tay)