package com.runnable.lambda;

public class RunnableExample {
    public static void main(String args[]){
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable...");
            }
        });
        myThread.run();

        Thread myLambdaThread = new Thread(()->System.out.println("Printing LambdaRunnable"));
        myLambdaThread.run();

    }
}
