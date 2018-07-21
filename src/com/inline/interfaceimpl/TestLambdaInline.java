package com.inline.interfaceimpl;

import com.create.lambda.LambdaInterface;
//1.lambda implementation
//2.inline implementation
public class TestLambdaInline {

    public static void main(String args[]) {

        LambdaInterface stringLambda = () -> System.out.println("My First own lambda");
        stringLambda.testingLambdaInterface();

        LambdaInterface inlineInterface = new LambdaInterface() {
            @Override
            public void testingLambdaInterface() {
                System.out.println("Printing From inline interface");
            }
        };
        inlineInterface.testingLambdaInterface();

    }

}
