This is Design patterns coding example project.
I will explain design patterns and provide source code examples in java for each of them.

Behavioral design patterns are design patterns that are used to describe how objects communicate with each other 
and how they operate within a larger system. Here is a list of common behavioral design patterns:

1. Chain of Responsibility: Passes a request along a dynamic chain of handlers until it is handled.
2. Command: Encapsulates a request as an object, allowing you to parametrize clients with different requests, queue or log requests, and support undoable operations.
3. Interpreter: Implements a specialized language by using a defined grammar and representing the language as an abstract syntax tree.
4. Iterator: Provides a way to access the elements of an object sequentially without exposing its underlying representation.
5. Mediator: Defines an object that encapsulates how a set of objects interact, reducing the dependencies between them.
6. Memento: Captures the internal state of an object without violating encapsulation, allowing the object to be restored to this state later.
7. Observer: Defines a one-to-many dependency between objects, so that when one object changes state, all of its dependents are notified and updated automatically.
8. State: Allows an object to alter its behavior when its internal state changes, appearing to change its class.
9. Strategy: Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
10. Template Method: Defines the skeleton of an algorithm as an abstract class, allowing its subclasses to provide concrete behavior.
11. Visitor: Separates an algorithm from an object structure by moving the hierarchy of methods into one object.


Creational design patterns are design patterns that are used to describe how objects are created 
and managed within a system. Here is a list of common creational design patterns:

1. Abstract Factory: 
Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
2. Builder: 
Separates the construction of a complex object from its representation, 
allowing the same construction process to create different representations.
3. Factory Method: 
Defines an interface for creating an object, but lets subclasses decide which class to instantiate.
4. Prototype: 
Specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying this prototype.
5. Singleton: 
Ensures that a class has only one instance and provides a global access point to it.

Structural design patterns are design patterns that are used to describe how objects 
and classes can be composed to form larger structures. Here is a list of common structural design patterns:

1. Adapter: Allows two incompatible interfaces to work together by wrapping one interface within the other.
2. Bridge: Decouples an abstraction from its implementation, allowing the two to vary independently.
3. Composite: Lets you compose objects into tree structures and then work with these structures as if they were individual objects.
4. Decorator: Lets you add new behavior to objects by wrapping them in decorator objects that contain the new behavior.
5. Facade: Provides a simplified interface to a complex system, hiding its underlying complexity.
6. Flyweight: Allows you to share objects to save memory and reduce the number of objects that need to be created.
7. Proxy: Provides a surrogate or placeholder for another object to control access to it.