package com.animals;

public class Cat extends Animal {

    private void meow() {
        System.out.println("meow!");
    }

    @Override
    public void makeSound() {
        meow();
    }
}
