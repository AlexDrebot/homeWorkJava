package jav.Homework.Lesson5;

public class Cat extends Animals{
    Cat(String type, String name, float run,float jump, float swim){
        super(type, name, run, jump, swim);
    }
    @Override
    protected float swim(float swimLength){
        return swimCant;
    }
}
