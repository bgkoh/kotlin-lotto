package view

import controller.response.LottoDto
import controller.response.LottoStatisticsDto

class OutputView {
    fun printEnterPrice() {
        println("구입 급액을 입력해 주세요.")
    }

    fun printEnterWinningLotto() {
        println("지난 주 당첨 번호를 입력해 주세요.")
    }

    fun printEnterBonus() {
        println("보너스 볼을 입력해 주세요.")
    }

    fun printLottos(lottos: List<LottoDto>) {
        lottos.forEach { println(it) }
    }

    fun printLottoStatistics(statistics: List<LottoStatisticsDto>) {
        statistics.forEach { println(it) }
    }
}