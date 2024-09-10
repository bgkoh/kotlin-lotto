package controller

import model.Lotto
import model.WinningLotto
import view.InputView
import view.OutputView

class LottoController(val inputView: InputView, val outputView: OutputView) {
    fun getPrice(): Int {
        outputView.printEnterPrice()
        val price = inputView.getPrice()
        require(price > 0)
        return price;
    }

    fun getWinningLotto(): WinningLotto {
        outputView.printEnterWinningLotto()
        val lotto = Lotto.from(inputView.getWinningLotto())
        outputView.printEnterBonus()
        val bonus = inputView.getBonus()
        return WinningLotto(lotto, bonus)
    }
}