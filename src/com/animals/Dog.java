package com.animals;

public class Dog extends Animal {

    private void bark(){
        System.out.println("gav!");
    }

    @Override
    public void makeSound() {
        bark();
    }
}
