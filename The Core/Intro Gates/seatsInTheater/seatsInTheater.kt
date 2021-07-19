fun seatsInTheater(nCols: Int, nRows: Int, col: Int, row: Int): Int {
    val rows: Int = nRows - row
    val cols: Int = nCols - col + 1
    return (rows * cols)
}

// Ahmed Mones (9_tay)