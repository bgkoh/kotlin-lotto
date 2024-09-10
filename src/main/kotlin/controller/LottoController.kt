package controller

import controller.response.LottoDto
import controller.response.LottoStatisticsDto
import model.Lotto
import model.LottoMachine
import model.LottoStatistics
import model.WinningLotto
import view.InputView
import view.OutputView

class LottoController(val inputView: InputView, val outputView: OutputView) {
    fun getLotto(): List<Lotto> {
        outputView.printEnterPrice()
        val price = inputView.getPrice()
        require(price > 0)
        val lottoMachine = LottoMachine()
        val lotto = lottoMachine.buy(price)
        val lottoDtoList = lotto.map { LottoDto.from(it) }
        outputView.printLottos(lottoDtoList)
        return lotto
    }

    fun getWinningLotto(): WinningLotto {
        outputView.printEnterWinningLotto()
        val lotto = Lotto.from(inputView.getWinningLotto())
        outputView.printEnterBonus()
        val bonus = inputView.getBonus()
        return WinningLotto(lotto, bonus)
    }

    fun printLottoStatistics(lotto: List<Lotto>, winningLotto: WinningLotto) {
        val lottoStatistics = LottoStatistics(lotto, winningLotto)
        val lottoStatisticDtoList = lottoStatistics.matchCount().map { LottoStatisticsDto.from(it.key, it.value) }
        outputView.printLottoStatistics(lottoStatisticDtoList)
    }

}