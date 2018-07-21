package com.learn.lambda;

public class HelloLambda {

    //let printLambda know what it need to do by passing behaviour as arguement
    //Passing a thing having a behaviour
    public void printLambda(LambdaPrint lambdaPrint) {
        lambdaPrint.printingLambda();
        System.out.println("Hello.. Welcome to lambdas...");
    }

    public static void main(String args[]) {
        HelloLambda helloLambda = new HelloLambda();
        LambdaPrint lambdaPrint = new LambdaPrintImpl();
        LambdaPrint myLambdaFunction = () -> System.out.println("Printing from lambda");
        myLambdaFunction.printingLambda();

    }
}

