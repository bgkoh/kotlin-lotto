package model

class LottoStatistics(val lotto: List<Lotto>, val winningLotto: WinningLotto) {

    fun matchCount(): Map<Rank, Int> {
        return Rank.values().associateWith { rank -> lotto.count { rank == winningLotto.rank(it) }}
    }
}