package com.w2a;

public class Car {
    private String name;
    private String capacity;

    public Car(String n, String c){
        this.name = n;
        this.capacity = c;
    }

    public void printAttributes(){
        System.out.println(this.name);
        System.out.println(this.capacity);
    }

}
