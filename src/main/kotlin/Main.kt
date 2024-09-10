import controller.LottoController
import view.InputView
import view.OutputView

fun main() {
    val inputView = InputView()
    val outputView = OutputView()
    val controller = LottoController(inputView, outputView)

    val lottoList = controller.getLotto()
    val winningLotto = controller.getWinningLotto()
    controller.printLottoStatistics(lottoList, winningLotto)
}