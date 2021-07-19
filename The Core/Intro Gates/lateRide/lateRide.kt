fun lateRide(n: Int): Int {
    var hur: Int = n / 60
    var min: Int = n % 60
    return (hur % 10) + (hur / 10) + (min % 10) + (min / 10)
}

// Ahmed Al-Taie (9_tay)