package com.imooc.maven02.until;

import org.junit.Assert;
import org.junit.Test;

public class SpeakTest {
    @Test
    public void testSayHi() {
        Assert.assertEquals("Hello World!", new Speak().sayHi());
    }
}
