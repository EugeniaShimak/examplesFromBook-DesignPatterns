package com.shimak;

class Duck {

    public void flyDuck(){
        FlyingSlow flyingSlow = new FlyingSlow();
        flyingSlow.fly("Duck");
    }
    public void crushDuck(){
        FlyingSlow flyingSlow = new FlyingSlow();
        flyingSlow.crush("Duck");
    }
}
