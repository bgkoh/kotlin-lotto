package model

class LottoMachine {
    fun buy(money: Int): List<Lotto> {
        val numberOfLottos = money / 1000;
        return IntRange(1, numberOfLottos).map {
            Lotto(generateLottoNumbers())
        }
    }

    private fun generateLottoNumbers() : Set<Int> {
        return IntRange(1,45).shuffled().subList(0, 6).toSet()
    }
}