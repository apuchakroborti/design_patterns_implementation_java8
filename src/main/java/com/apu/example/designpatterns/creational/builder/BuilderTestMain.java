package com.apu.example.designpatterns.creational.builder;

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
}
