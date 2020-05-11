package org.example.animal;

public class Horse extends Animal{

    public Horse(String name, double weight) {
        super(name, weight);
    }

    public void eat(){
        System.out.println(getName() + " eats some grass");
    }

}
