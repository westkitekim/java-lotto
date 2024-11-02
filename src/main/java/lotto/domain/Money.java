package lotto.domain;

public class Money {
    private static int gameNumbers;
    private static final int LOTTO_PRICE = 1000;

    public static int calculateLottoGameCount(int purchasePrice) {
        gameNumbers = purchasePrice / LOTTO_PRICE;
        return gameNumbers;
    }

}
