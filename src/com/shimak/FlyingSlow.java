package com.shimak;

public class FlyingSlow  implements Flying {


    @Override
    public void fly(String name) {
        if (name.length()==0) {
            name = "nobody";
        }
        System.out.println("Fly slow "+name);
    }

    @Override
    public void crush(String name) {
        if (name.length()==0) {
            name = "nobody";
        }
        System.out.println("crush small "+name);
    }
}
