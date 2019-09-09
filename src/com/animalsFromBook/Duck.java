package com.animalsFromBook;

public class Duck {
    public void display() {
        System.out.println("I'm utka!");
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

}
