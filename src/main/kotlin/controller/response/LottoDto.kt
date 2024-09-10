package controller.response

import model.Lotto

class LottoDto(val numbers: Set<Int>) {
    companion object {
        fun from(lotto: Lotto): LottoDto {
            return LottoDto(lotto.numbers)
        }
    }

    override fun toString(): String {
        return "$numbers"
    }
}