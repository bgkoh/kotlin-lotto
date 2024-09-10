package model

class WinningLotto(
    val lotto: Lotto,
    val bonus: Int
) {
    init {
        require(!lotto.contains(bonus))
    }

    fun rank(lotto: Lotto): Int {
        val match = this.lotto.intersect(lotto).size
        val matchBonus = lotto.contains(bonus)

        return rank(match, matchBonus)
    }

    private fun rank(match: Int, bonus: Boolean): Int = when {
        match == 6 -> 1
        match == 5 && bonus -> 2
        match == 5 && !bonus -> 3
        match == 4  -> 4
        match == 3  -> 5
        else -> 6
    }

}