import model.LottoMachine
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LottoMachineTest() {
    @Test
    fun `구입금액 입력 하면 로또를 발급한다`() {
        assertThat(LottoMachine().buy(10000)).hasSize(10)
        assertThat(LottoMachine().buy(1500)).hasSize(1)
    }
}