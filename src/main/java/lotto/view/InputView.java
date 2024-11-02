package lotto.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
    private static final int LOTTO_PRICE = 1000;

    public static int requestPurchasePrice() throws IOException {
        System.out.println("구입금액을 입력해 주세요.");

        return Integer.parseInt(br.readLine());
    }



}
