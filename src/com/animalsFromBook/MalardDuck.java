package com.animalsFromBook;

public class MalardDuck extends Duck{
    public void display() {
        System.out.println("I'm MalardDuck!");
    }
    public MalardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWinds();
    }

}
