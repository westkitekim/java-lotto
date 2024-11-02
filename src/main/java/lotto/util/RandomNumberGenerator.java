package lotto.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberGenerator {
    public static final int LOTTO_MIN_NUMBER = 1;
    public static final int LOTTO_MAX_NUMBER = 45;
    public static final int LOTTO_NUMBER_COUNT = 6;

    public static List<Integer> generate() {
         List<Integer> randomNumbers = IntStream.rangeClosed(1, 45)
                 .boxed()
                 .collect(Collectors.toList());

         Collections.shuffle(randomNumbers);

         return randomNumbers.subList(0, LOTTO_NUMBER_COUNT);
    }
}
