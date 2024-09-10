package model

class WinningLotto(
    val lotto: Lotto,
    val bonus: Int
) {
    init {
        require(!lotto.contains(bonus))
    }

}