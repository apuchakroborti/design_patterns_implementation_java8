package com.apu.example.designpatterns.structural.flyweight;

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
        Animal catAnimal = AnimalFactory.getCat("CAT");
        catAnimal.printAnimalAttribute();

        Animal catAnimal2 = AnimalFactory.getCat("CAT");
        catAnimal2.printAnimalAttribute();

        Animal cowAnimal = AnimalFactory.getCat("COW");
        cowAnimal.printAnimalAttribute();

        Animal dogAnimal = AnimalFactory.getCat("DOG");
        dogAnimal.printAnimalAttribute();

        System.out.println(catAnimal.hashCode());
        System.out.println(catAnimal2.hashCode());
        System.out.println(cowAnimal.hashCode());
        System.out.println(dogAnimal.hashCode());

    }

}
