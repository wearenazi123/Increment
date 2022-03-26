package com.company;

public class Callee1 implements Incrementable{
    private int i=0;
    @Override
    public void inncrement() {
        i++;
        System.out.println(i);
    }
}
