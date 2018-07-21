package com.create.lambda;

public class TestLambda {
    public static void main(String args[]) {

        LambdaInterface stringLambda = () -> System.out.print("My First own lambda");
        stringLambda.testingLambdaInterface();
    }
}
