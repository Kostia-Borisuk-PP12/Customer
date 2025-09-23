package app11;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition 5 + 7 = " + addition.operate(5, 7));

        StringManipulator toUpper = str -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpper.manipulate("hello world"));

        Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;
        String testString = "HeLLo WoRLd!";
        System.out.println("Uppercase count in '" + testString + "': "
                + uppercaseCounter.apply(testString));

        Supplier<Integer> randomSupplier =
                () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number [1-100]: " + randomSupplier.get());
    }
}

