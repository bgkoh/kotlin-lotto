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

    @Test
    fun `1등 로또를 확인할 수 있다`() {
        val lotto = Lotto(setOf(1,2,3,4,5,6))
        val winningLotto = WinningLotto(Lotto(setOf(1,2,3,4,5,6)), 7)
        assertThat(winningLotto.rank(lotto)).isEqualTo(1)
    }

    @Test
    fun `2등 로또를 확인할 수 있다`() {
        val lotto = Lotto(setOf(1,2,3,4,5,7))
        val winningLotto = WinningLotto(Lotto(setOf(1,2,3,4,5,6)), 7)
        assertThat(winningLotto.rank(lotto)).isEqualTo(2)
    }

    @Test
    fun `3등 로또를 확인할 수 있다`() {
        val lotto = Lotto(setOf(1,2,3,4,5,8))
        val winningLotto = WinningLotto(Lotto(setOf(1,2,3,4,5,6)), 7)
        assertThat(winningLotto.rank(lotto)).isEqualTo(3)
    }

    @Test
    fun `4등 로또를 확인할 수 있다`() {
        val lotto = Lotto(setOf(1,2,3,4,7,8))
        val winningLotto = WinningLotto(Lotto(setOf(1,2,3,4,5,6)), 7)
        assertThat(winningLotto.rank(lotto)).isEqualTo(4)
    }

    @Test
    fun `5등 로또를 확인할 수 있다`() {
        val lotto = Lotto(setOf(1,2,3,7,9,8))
        val winningLotto = WinningLotto(Lotto(setOf(1,2,3,4,5,6)), 7)
        assertThat(winningLotto.rank(lotto)).isEqualTo(5)
    }

    @Test
    fun `6등 로또를 확인할 수 있다`() {
        val lotto = Lotto(setOf(1,2,8,9,10,11))
        val winningLotto = WinningLotto(Lotto(setOf(1,2,3,4,5,6)), 7)
        assertThat(winningLotto.rank(lotto)).isEqualTo(6)
    }

}