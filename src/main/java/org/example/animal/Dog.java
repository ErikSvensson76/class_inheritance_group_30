package org.example.animal;

import java.util.Objects;

public class Dog extends Animal{
    private int leg;
    private int teeth;
    private int tail;

    public Dog(String name, double weight, int leg, int teeth, int tail){
        super(name, weight);
        this.leg = leg;
        this.teeth = teeth;
        this.tail = tail;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public void wagTail(){
        System.out.println(getName() + " is wagging the tail");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " the dog eats");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return leg == dog.leg &&
                teeth == dog.teeth &&
                tail == dog.tail;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), leg, teeth, tail);
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString()+
                "leg=" + leg +
                ", teeth=" + teeth +
                ", tail=" + tail +
                '}';
    }
}
