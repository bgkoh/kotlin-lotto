package model

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class WinningLottoTest {
    @Test
    fun `당첨번호를 입력받을 수 있다`() {
        val lotto = Lotto(setOf(1,2,3,4,5,6))
        val bonus = 7
        val winningLotto = WinningLotto(lotto, bonus)
        assertThat(winningLotto.lotto).isEqualTo(Lotto(setOf(1,2,3,4,5,6)))
        assertThat(winningLotto.bonus).isEqualTo(7)
    }

    @Test
    fun `로또번호와 보너스 번호가 중복일 경우 예외가 발생한다`() {
        val lotto = Lotto(setOf(1,2,3,4,5,6))
        val bonus = 6
        assertThrows<IllegalArgumentException> { WinningLotto(lotto, bonus) }
    }

}