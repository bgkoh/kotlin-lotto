package model

class WinningLotto(
    val lotto: Lotto,
    val bonus: Int
) {
    init {
        require(!lotto.contains(bonus))
    }

    fun rank(lotto: Lotto): Rank {
        val match = this.lotto.intersect(lotto).size
        val matchBonus = lotto.contains(bonus)

        return rank(match, matchBonus)
    }

    private fun rank(match: Int, bonus: Boolean): Rank = when {
        match == 6 -> Rank.FIRST
        match == 5 && bonus -> Rank.SECOND
        match == 5 && !bonus -> Rank.THIRD
        match == 4  -> Rank.FOURTH
        match == 3  -> Rank.FIFTH
        else -> Rank.MISS
    }

}