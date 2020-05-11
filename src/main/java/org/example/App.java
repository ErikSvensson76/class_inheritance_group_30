package org.example;

import org.example.animal.Animal;
import org.example.animal.Dog;
import org.example.animal.Horse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Dog ruffie = new Dog("Ruffie", 20, 4, 20, 1);
        Dog ruffie2 = new Dog("Ruffie", 20, 4, 20, 1);
        Animal animal = new Horse("Ziggy", 200);
        Animal anotherAnimal = new Dog("Fido", 6, 4, 25, 1);

        animal.eat();
        System.out.println(ruffie);

        System.out.println(isEquals(ruffie, ruffie2));
        System.out.println(hashCodeSame(ruffie, ruffie2));
    }

    public static boolean isEquals(Animal animal, Animal animal2){
        return animal.equals(animal2);
    }

    public static boolean hashCodeSame(Animal animal, Animal animal2){
        return  animal.hashCode() == animal2.hashCode();
    }
}
