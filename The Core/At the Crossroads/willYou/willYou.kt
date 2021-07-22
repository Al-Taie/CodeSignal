fun willYou(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean {
    if (young && beautiful && loved)
        return false
    else if ((young && beautiful) && !loved)
        return true
    else if ((young && beautiful) || loved)
        return true

    return false
}
// Ahmed Al-Taie (9_tay)