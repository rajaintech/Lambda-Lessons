package com.lambda.exception.handling;

import java.util.function.BiConsumer;

public class LambdaExceptionHandling {
    public static void main(String args[]) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;
        process(someNumbers, key, wrapperLambda((a, b) -> System.out.println(a / b)));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (a, b) -> {
            try {
                consumer.accept(a, b);
            } catch (ArithmeticException e) {
                System.out.println("Exception printed from Wrapper lambda...");
            }

        };
    }
}
