package com.shimak;


public class FlyingFast implements Flying{
    public void display(){
        System.out.println("FlyingFast");
    }
    @Override
    public void fly(String name) {
        if (name.length()==0) {
            name = "nobody";
        }
        System.out.println("Fly fast "+name);
    }

    @Override
    public void crush(String name) {
        if (name.length()==0) {
            name = "nobody";
        }
        System.out.println("crush BOOOOM "+name);
    }
}


