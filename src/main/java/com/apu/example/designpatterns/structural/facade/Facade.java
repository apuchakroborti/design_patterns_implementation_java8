package com.apu.example.designpatterns.structural.facade;

/*
* The facade design pattern is useful in the following situations:

1. When you want to provide a simplified interface to a complex subsystem.
* The facade can provide a higher-level interface that makes the subsystem easier to use.

2. When you want to decouple a client from a subsystem.
* The facade can provide an interface that is more stable than the subsystem's implementation,
* which allows the client to continue functioning even if the subsystem changes.

3. When you want to wrap a poorly designed collection of APIs with a single, well-designed API.

4. When you want to layer a system and want to minimize the communication and dependencies between layers.
* Using a facade can improve the portability of the system by allowing you to wrap a layer around the system
* and protect it from changes in the implementation of lower-level layers.

5. When you want to structure a subsystem into smaller parts that can be accessed through a unified interface.
* This can make the subsystem more flexible and easier to use.

Overall, the facade design pattern is useful when you want to provide a simple,
* easy-to-use interface to a complex subsystem
* or when you want to decouple a client from a subsystem to improve the flexibility and portability of the system.
* */


public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;
    private Subsystem3 subsystem3;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
    }

    public void methodA() {
        subsystem1.method1();
        subsystem2.method2();
        subsystem3.method3();
    }

    public void methodB() {
        subsystem1.method1();
        subsystem3.method3();
    }
}