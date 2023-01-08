package com.apu.example.designpatterns.structural.proxy;

/*
Provides a surrogate or placeholder for another object to control access to it.
* public interface Subject {
    void request();
}

public class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject: Handling request");
    }
}

public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    public void request() {
        if (checkAccess()) {
            realSubject.request();
            logAccess();
        }
    }

    private boolean checkAccess() {
        System.out.println("Proxy: Checking access prior to firing a real request.");
        return true;
    }

    private void logAccess() {
        System.out.println("Proxy: Logging the time of request.");
    }
}

public class Main {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
In this example, the Proxy class acts as an intermediary between the RealSubject class and the client code.
The Proxy class has the same interface as the RealSubject class, so it can be used in the same way as the RealSubject.
When the request method is called on the Proxy class, it first checks for access
and then logs the request before calling the request method on the RealSubject class.
*
* */
public class ProxyTestClientMain {

    public void testProxy(){
        /*
        *  [client] -->
        *  call/ creates proxy instance [Proxy] -->
        *  Call method of real subject only after proper security checks and authentications [Real Subject]
        * */
        Subject proxy = new Proxy();
        proxy.method();
    }

    public static void main(String[] args) {
        new ProxyTestClientMain().testProxy();
    }
}
