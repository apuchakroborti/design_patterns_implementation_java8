package com.apu.example.designpatterns.creational.builder;

/*
 The builder pattern is a design pattern that is used to create complex objects in a step-by-step fashion.
 It allows you to create an object by specifying its various parts in a separate builder object,
 rather than creating the object directly using a constructor or factory method.

The main advantage of using the builder pattern is that it can help to make your code more flexible
 and maintainable by separating the process of constructing an object from the object itself.
 This can make it easier to change the way the object is constructed without having to make changes to the object itself,
 and can also make it easier to understand
 and modify the code by clearly separating the construction logic from the rest of the code.

Here is an example of how the builder pattern might be used in Java:
class Product {
  private String field1;
  private String field2;
  private String field3;
  // ...

  private Product(Builder builder) {
    this.field1 = builder.field1;
    this.field2 = builder.field2;
    this.field3 = builder.field3;
    // ...
  }

  public static class Builder {
    private String field1;
    private String field2;
    private String field3;
    // ...

    public Builder setField1(String field1) {
      this.field1 = field1;
      return this;
    }

    public Builder setField2(String field2) {
      this.field2 = field2;
      return this;
    }

    public Builder setField3(String field3) {
      this.field3 = field3;
      return this;
    }

    // ...

    public Product build() {
      return new Product(this);
    }
  }
}
To use this builder to create a Product object, you would do something like this:

Product product = new Product.Builder()
                        .setField1("value1")
                        .setField2("value2")
                        .setField3("value3")
                        .build();
This creates a Product object with the specified field values using the builder pattern.
* */
public class BuilderTestMain {

    public void testBuilderPattern(){
        //create object of the required home builder
        EarthQuakeResistantBuilder earthQuakeResistantBuilder = new EarthQuakeResistantBuilder();

        //create object of director that will keep an eye on your builder
        Director directorOfEarthQuake = new Director(earthQuakeResistantBuilder);
        directorOfEarthQuake.manageRequiredHomeConstruction();
        Home homeConstructionAtTheEnd = directorOfEarthQuake.getComplexObjectOfHome();

        System.out.println(homeConstructionAtTheEnd);
        System.out.println(homeConstructionAtTheEnd.getFloor());


        //create object of the required home builder
        FloodResistantBuilder floodResistantBuilder = new FloodResistantBuilder();

        //create object of director that will keep an eye on your builder
        Director directorOfFlood = new Director(floodResistantBuilder);
        directorOfFlood.manageRequiredHomeConstruction();
        Home floodSafeHomeConstructionAtTheEnd = directorOfFlood.getComplexObjectOfHome();

        System.out.println(floodSafeHomeConstructionAtTheEnd);
        System.out.println(floodSafeHomeConstructionAtTheEnd.getFloor());
    }
//    test main method
    public static void main(String[] args) {
        new BuilderTestMain().testBuilderPattern();
    }
}
