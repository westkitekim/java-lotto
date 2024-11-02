package lotto.domain;

import java.util.List;

public class LottoGame {

    private List<Integer> numbers;

    public void LottoNumbers(int price) {
        this.numbers = this.createLotto(price);
    }

    public List<Integer> createLotto(int price) {
        int moneyByLottoGameCnts = Money.calculateLottoGameCount(price);

        return null;
    }
}
