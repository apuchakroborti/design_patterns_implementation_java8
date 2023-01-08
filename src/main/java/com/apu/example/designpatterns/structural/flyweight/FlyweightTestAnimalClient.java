package com.apu.example.designpatterns.structural.flyweight;

/*
* The flyweight design pattern is used to reduce the number of objects that are created
* and to decrease memory usage by sharing objects that are identical or largely similar.
* Here is an example of how the flyweight pattern might be implemented in Java:

class Flyweight {
  private final String intrinsicState;

  public Flyweight(String intrinsicState) {
    this.intrinsicState = intrinsicState;
  }

  public void operation(String extrinsicState) {
    // ...
  }
}

class FlyweightFactory {
  private final Map<String, Flyweight> flyweights = new HashMap<>();

  public Flyweight getFlyweight(String key) {
    Flyweight flyweight = flyweights.get(key);
    if (flyweight == null) {
      flyweight = new Flyweight(key);
      flyweights.put(key, flyweight);
    }
    return flyweight;
  }
}
To use this flyweight factory to create flyweight objects, you would do something like this:

FlyweightFactory factory = new FlyweightFactory();
Flyweight flyweight1 = factory.getFlyweight("key1");
Flyweight flyweight2 = factory.getFlyweight("key2");
Flyweight flyweight3 = factory.getFlyweight("key1");

// flyweight1 and flyweight3 are the same object
In this example, the flyweight factory maintains a map of flyweight objects that have already been created.
When the getFlyweight method is called, it checks the map to see if a flyweight object with the specified key has already been created.
If it has, it returns the existing object; if not, it creates a new flyweight object with the specified key and adds it to the map.
This allows the flyweight factory to share flyweight objects and reduce the number of objects that need to be created.
*
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
