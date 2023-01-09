package com.apu.example.designpatterns.structural.composite;


/*
* The Composite design pattern is a structural design pattern that allows you to compose objects into tree structures
* and then treat them as individual objects. This pattern is used to structure objects into tree-like structures
* and then work with these structures as if they were individual objects.
*
* Usage of this design pattern:
* The Composite design pattern is useful when you want to represent a part-whole hierarchy of objects
* and you want to treat individual objects and compositions of objects uniformly.

Here are some examples of when you might use the Composite design pattern:

1. When you have a tree-like structure of objects and you want to be able to treat the individual objects and compositions of objects uniformly
2. When you want to add new types of objects to the hierarchy without affecting the existing code
3. When you want to hide the implementation details of the composite objects from the client
For example, you might use the Composite design pattern to represent a file system,
* where the individual files and directories are represented as objects,
* and the composite objects (directories) can contain both files and other directories.
* You can then perform operations on the file system (such as copying, moving, and deleting) uniformly on both files and directories.
*
*
* */
public class CompositeTestMain {
    public static void main(String[] args) {
        Component root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Component comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);
        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        //test leaf add
        leaf.add(new Leaf("Test Leaf child"));


        root.add(leaf);
        root.remove(leaf);

        root.display(1);
    }
}
