package controller.response

import model.Rank

class LottoStatisticsDto(val matchCount: Int, val winningMoney: Int, val lottoCount: Int) {

    companion object {
        fun from(rank: Rank, lottoCount: Int):LottoStatisticsDto {
            return LottoStatisticsDto(rank.matchCount, rank.winningMoney, lottoCount)
        }
    }

    override fun toString(): String {
        return "${matchCount}개 일치 (${winningMoney}원)- ${lottoCount}개"
    }


}