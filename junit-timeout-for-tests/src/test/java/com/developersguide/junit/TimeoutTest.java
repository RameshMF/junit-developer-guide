package com.developersguide.junit;

import org.junit.Test;

public class TimeoutTest {
	//This test will always failed :)
    @Test(timeout = 1000)
    public void infinity() {
        while (true) ;
    }

    //This test can't run more than 5 seconds, else failed
    @Test(timeout = 5000)
    public void testSlowMethod() {
        //...
    }
}
