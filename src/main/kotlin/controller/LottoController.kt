package controller

import view.InputView
import view.OutputView

class LottoController(val inputView: InputView, val outputView: OutputView) {
    fun getPrice(): Int {
        outputView.printEnterPrice()
        val price = inputView.getPrice()
        require(price > 0)
        return price;
    }
}