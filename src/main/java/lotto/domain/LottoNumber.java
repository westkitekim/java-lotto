package lotto.domain;

import lotto.util.RandomNumberGenerator;

import java.util.Collections;
import java.util.List;

public class LottoNumber {
    private List<Integer> numbers;

    public void LottoNumbers() {
        this.numbers = this.getRandomNumbers();
    }

    // 금액을 입력하면 로또 번호 출력
    // 로또 게임 번호 출력
    public List<Integer> getRandomNumbers() {
        List<Integer> randomNumbers = RandomNumberGenerator.generate();
        Collections.sort(randomNumbers);

        return randomNumbers;
    }

}
