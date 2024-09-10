package model

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class LottoStatisticsTest {

    @Test
    fun `로또 당첨 통계를 생성한다`() {
        val lottoList = listOf(
            Lotto(setOf(1,2,3,4,5,6)), // 1등
            Lotto(setOf(1,2,3,4,5,7)), // 2등
            Lotto(setOf(1,2,3,4,5,9)), // 3등
            Lotto(setOf(1,2,3,9,15,16)), // 5등
        )
        val winningLotto = WinningLotto(Lotto(setOf(1,2,3,4,5,6)), 7)
        val lottoStatistics = LottoStatistics(lottoList, winningLotto)

        Assertions.assertThat(lottoStatistics.matchCount()).isEqualTo(
            mapOf(
                Pair(Rank.FIRST, 1),
                Pair(Rank.SECOND, 1),
                Pair(Rank.THIRD, 1),
                Pair(Rank.FOURTH, 0),
                Pair(Rank.FIFTH, 1),
                Pair(Rank.MISS, 0))
        )

    }

}