package test;

import org.testng.annotations.Test;

public class TestCases {


    @Test(priority = 2)
    void setup(){
        System.out.println(" I am inside Setup");
    }

    @Test(priority = 1)
    void testSteps(){
        System.out.println("I am inside testSteps");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("i am inside tearDown");
    }
}
