package model

enum class Rank(val rank: Int, val winningMoney: Int, val matchCount: Int) {
    FIRST(1, 2_000_000_000, 6),
    SECOND(2, 30_000_000, 5),
    THIRD(3, 1_500_000, 5),
    FOURTH(4, 50_000, 4),
    FIFTH(5, 5_000, 3),
    MISS(6, 0, 0),
}