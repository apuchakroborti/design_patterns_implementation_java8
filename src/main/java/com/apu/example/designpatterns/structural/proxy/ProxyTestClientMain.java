package com.apu.example.designpatterns.structural.proxy;

/*
Provides a surrogate or placeholder for another object to control access to it.

In this example, the Proxy class acts as an intermediary between the RealSubject class and the client code.
The Proxy class has the same interface as the RealSubject class,
so it can be used in the same way as the RealSubject.
When the request method is called on the Proxy class, it first checks for access
and then logs the request before calling the request method on the RealSubject class.
*/

/*
* Do hibernate uses the proxy pattern
Yes, Hibernate makes use of the proxy pattern to implement lazy loading of associations.
In Hibernate, when an entity is loaded from the database,
it is wrapped in a proxy object that implements the same interface as the entity.
The proxy object is returned to the application instead of the actual entity object.
The proxy object has the same properties and methods as the actual object,
but it contains additional code that allows it
to load the actual object's data from the database only when it is needed.

When the application calls a method or accesses a property of the proxy object,
the proxy checks to see if the actual object's data has been loaded.
If the data has not been loaded, the proxy loads the data from the database,
sets the properties of the actual object, and then returns the requested value.

This way, Hibernate can avoid loading all of the data for an entity when it is first retrieved from the database,
which can greatly improve the performance of the application.
This is known as lazy loading, it only loads the data when it's needed,
and it makes the application more efficient by reducing the amount of data that needs to be loaded and processed.

In summary, Hibernate uses the proxy pattern to implement lazy loading of associations,
this way it can improve the performance of the application by reducing the amount of data that needs to be loaded and processed.
*
* */

public class ProxyTestClientMain {

    public void testProxy(){
        /*
        [client] -->
        call/ creates proxy instance [Proxy] -->
        Call method of real subject only after proper security checks and authentications [Real Subject]
         */

        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }

    public static void main(String[] args) {
        new ProxyTestClientMain().testProxy();
    }
}
