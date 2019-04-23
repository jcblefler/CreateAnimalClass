package com.company;

public class Mouse extends Animal{

    public  Mouse() {
        super();
        System.out.println("Now I am a Mouse!");
    }

    @Override
    public String sleep(){
        return "A mouse sleeps...";
    }

    @Override
    public String eat(){
        return "A mouse eats...";
    }

    public String squeak(){
        return "squeak...squeak";
    }
}
