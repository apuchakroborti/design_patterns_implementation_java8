package com.apu.example.designpatterns;

import com.apu.example.designpatterns.creational.builder.BuilderTestMain;
import com.apu.example.designpatterns.structural.flyweight.FlyweightTestAnimalClient;
import com.apu.example.designpatterns.structural.proxy.ProxyTestClientMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    public static void main(String[] args) {
//        new FactoryPatternMainClass().testFactoryPatternMain();
//        new AbsFactoryMainClass().testAbsFactory();
//        new SingletonTestMain().testSingleton();
//        new PrototypePatternMainClass().testPrototypePattern();
//        new BuilderTestMain().testBuilderPattern();
//        new ProxyTestClientMain().testProxy();
//        new FlyweightTestAnimalClient().testFlyweightDP();
        SpringApplication.run(DesignPatternsApplication.class, args);

    }

}
