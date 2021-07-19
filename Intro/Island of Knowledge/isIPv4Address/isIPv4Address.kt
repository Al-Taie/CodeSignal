fun isIPv4Address(str: String): Boolean {
    val list = str.split('.')
    var isIPv4 = true

    if (list.size < 4 || list.size > 4 || str.contains("00") || str.contains("01")) return false

    list.forEach {
        try {
            if (!(it.toInt() in 0..255)) isIPv4 = false
        } catch (e: Exception) {
            isIPv4 = false
        }
    }
    return isIPv4
}

// Ahmed Mones (9_tay)