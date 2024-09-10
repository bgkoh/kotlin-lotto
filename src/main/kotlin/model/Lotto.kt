package model

data class Lotto(val numbers: Set<Int>) : Set<Int> by numbers {
    init {
        require(numbers.size == 6)
        require(numbers.all { it in 1..45 })
    }

    companion object {
        fun from(numberString: String): Lotto {
            return Lotto(numberString.split(",").map { it.trim() }.map { it.toInt() }.toSet())
        }
    }

}