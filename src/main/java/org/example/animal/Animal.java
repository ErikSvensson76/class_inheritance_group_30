package org.example.animal;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private double weight;

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract void eat();

    @Override
    public boolean equals(Object o) {
        //Return true if memory address match
        if (this == o) return true;

        //If null -> false || if not of same type -> false
        if (o == null || getClass() != o.getClass()){
            return false;
        }

        //We know o is of type Animal -> casting o into Animal animal
        Animal animal = (Animal) o;

        //Here actual comparison between state in animal occurs
        return Double.compare(animal.weight, weight) == 0 &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public String toString(){
        return "name: " + name + ", weight: " + weight;
    }
}
