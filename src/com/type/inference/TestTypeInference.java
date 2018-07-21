package com.type.inference;

public class TestTypeInference {
    public static void main(String args[]) {
        printLambda(s->s.length());
    }

    public static void printLambda(GetStringLengthLambda gsl){
        System.out.println(gsl.getStringLength("Hello Lambda"));

    }

    interface GetStringLengthLambda {
        int getStringLength(String s);
    }

}
