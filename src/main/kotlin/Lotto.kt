class Lotto(val numbers: Set<Int>) {
    init {
        require(numbers.size == 6)
        require(numbers.all { it in 1..45 })
    }
}