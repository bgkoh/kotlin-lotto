import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class LottoTest {
    @Test
    fun `생성된 로또 번호는 6개가 아니면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> { Lotto(setOf(1,2,3,4,5,6,7)) }
    }

    @Test
    fun `로또의 범위는 1~45가 아니면 예외가 발생한다`() {
        assertThrows<IllegalArgumentException> { Lotto(setOf(1,2,3,4,5,6,47)) }
    }
}