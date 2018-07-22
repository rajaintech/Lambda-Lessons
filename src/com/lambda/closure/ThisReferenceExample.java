package com.lambda.closure;
public class ThisReferenceExample {

    public void doProcess(int i, Process process){
        process.doProcess(i);

    }

    public static void main(String args[]){
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void doProcess(int i) {
                System.out.println("value of i is:"+ i);
                System.out.println(this);
            }
            public String toString(){
                return  "This is annonymous inner class...";
            }
        });

    }
}
