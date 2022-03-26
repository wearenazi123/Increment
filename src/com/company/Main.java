package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Callee1 c1=new Callee1();
        Callee2 c2 =new Callee2();
        MyIncrement.f(c2);
        Caller caller=new Caller(c1);
        Caller caller1=new Caller(c2.getCallbackReference());
        caller.go();
        caller.go();
        caller1.go();
        caller1.go();
    }
}
