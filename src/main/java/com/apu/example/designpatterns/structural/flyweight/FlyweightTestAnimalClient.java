package com.apu.example.designpatterns.structural.flyweight;

/*
* The Flyweight design pattern is a structural pattern that is used to minimize the number of objects
* created by sharing common data among multiple objects.
* The pattern is useful in situations where creating new objects is expensive and memory is a concern.
* */

public class FlyweightTestAnimalClient {
    /*
    * [Client] --> Calls/Creates Factory Instance [Factory] -->
    * Contains Map and logic to create new object
    * if not in MAP else return if key exists in MAP
    * [Specific Object]
    * [Interface Animal]      [Common Shareable Class]
    *
    * [Specific Object Dog] [Specific Object Cat]   [Specific Object Cow]
    *
    * */
    public void testFlyweightDP(){

        //these two objects share some attributes
        Animal catAnimal = AnimalFactory.getCat("CAT");
        catAnimal.printAnimalAttribute();

        Animal catAnimal2 = AnimalFactory.getCat("CAT");
        catAnimal2.printAnimalAttribute();



        Animal cowAnimal = AnimalFactory.getCat("COW");
        cowAnimal.printAnimalAttribute();

        Animal dogAnimal = AnimalFactory.getCat("DOG");
        dogAnimal.printAnimalAttribute();

        //these two objects have same the hashcode
        System.out.println(catAnimal.hashCode());
        System.out.println(catAnimal2.hashCode());

        //these two objects have different hash codes
        System.out.println(cowAnimal.hashCode());
        System.out.println(dogAnimal.hashCode());

    }

    public static void main(String[] args) {
        new FlyweightTestAnimalClient().testFlyweightDP();
    }

}
