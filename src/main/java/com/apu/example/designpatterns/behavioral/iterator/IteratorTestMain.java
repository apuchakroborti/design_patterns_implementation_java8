package com.apu.example.designpatterns.behavioral.iterator;


/*
* In this example, the Iterator interface defines the methods that any iterator must implement: hasNext() and next(). The Collection interface defines a single method, iterator(), that returns an instance of the Iterator interface.

The ConcreteIterator class implements the Iterator interface and is specific to the ConcreteCollection class, it keep track of position in the collection and it contains the collection.

The ConcreteCollection class is a collection that holds a list of objects and implements the Collection interface. It has a iterator() method that returns an instance of the ConcreteIterator class, which is specific to this collection.

A client can use the iterator as following:
*
* This allows you to iterate over the collection without having to know the underlying implementation of the collection. Additionally, you can add new types of collections and iterators without breaking the client code that uses them.

It's worth noting that java has built-in Iterator and Iterable interface that you can use for your collections, for example for ArrayList you can use Iterator as List<Integer>.iterator() . this example was just to show the pattern and how it works.
*
* */
public class IteratorTestMain {
    public static void main(String[] args) {

        Collection collection = new ConcreteCollection();
        collection.add("item 1");
        collection.add("item 2");
        collection.add("item 3");

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            String item = (String) iterator.next();
            System.out.println(item);
        }


    }
}
