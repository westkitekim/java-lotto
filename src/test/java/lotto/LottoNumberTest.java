package lotto;

import lotto.domain.LottoNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("로또 번호 생성 테스트")
public class LottoNumberTest {
    // 1. 로또 번호 6개 생성
    @Test
    @DisplayName("6개의 로또 번호를 생성할 수 있다.")
    void generateSixLottoNumbers() {
        LottoNumber lottoNumber = new LottoNumber();

        Assertions.assertThat(lottoNumber.getRandomNumbers()).hasSize(6);
    }


    // 2. 로또 번호 1 ~ 45까지의 랜덤값이다
    // -> 보류: 만약 같은 랜덤값이 나오면??

    // 3. 구입 금액에 따른 로또 번호 생성 횟수(per 1000원)
    @Test
    @DisplayName("6개의 로또 번호를 생성할 수 있다.")
    void getLottoGameCounts() {
        LottoNumber lottoNumber = new LottoNumber();

        Assertions.assertThat(lottoNumber.getRandomNumbers()).hasSize(6);
    }

    // 4. 당첨번호 숫자의 개수가 6개가 아니라면 예외를 던진다.

    // 5. 당첨번호와 일치하는 숫자의 개수에 따라 순위를 매길 수 있다.

    // 6. 수익률 계산?



}
