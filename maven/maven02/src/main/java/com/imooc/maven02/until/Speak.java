package com.imooc.maven02.until;

import com.imooc.maven01.model.HelloWorld;

public class Speak {
    public String sayHi() {
        return new HelloWorld().sayHello();
    }
}
