package calculator.domain;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Validator {
    private static final Pattern PATTERN_FOR_NUMBER = Pattern.compile("^-?\\d+(\\.\\d+)?$");
    private static final Set<String> OPERATORS = Arrays.stream(Operator.values())
            .map(Operator::getOperator)
            .collect(Collectors.toSet());
    public static void validateInputAndThrow(String input) {
        if (null == input || input.isEmpty()) {
            throw new IllegalArgumentException("입력값이 null이거나 빈 공맥인 문자입니다.");
        }
    }

    public static void validateArithmeticFormulaAndThrow(String input) {
        if (!isArithmeticFormula(input)) {
            throw new IllegalArgumentException(String.format("식에 포함된 기호는 사칙연산 %s 기호만 가능합니다.", OPERATORS));
        }
    }

    private static boolean isArithmeticFormula(String input) {
        boolean flag = true;
        for (char character : input.toCharArray()) {
            flag = isArithmeticElement(character);
        }

        return flag;
    }

    private static boolean isArithmeticOperator(char character) {
        return OPERATORS.contains(Character.toString(character));
    }

    private static boolean isArithmeticElement(char character) {
        if (!Character.isDigit(character) && !Character.isWhitespace(character) && !isArithmeticOperator(character)) {
            return false;
        }

        return true;
    }
}
