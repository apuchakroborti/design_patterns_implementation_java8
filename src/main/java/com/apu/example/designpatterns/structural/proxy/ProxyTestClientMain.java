package com.apu.example.designpatterns.structural.proxy;

public class ProxyTestClientMain {

    public void testProxy(){
        /*
        *  [client] -->
        *  call/ creates proxy instance [Proxy] -->
        *   Call method of real subject only after proper security checks and authentications [Real Subject]
        * */
        Subject proxy = new Proxy();
        proxy.method();
    }
}
