package test;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("OPENING BROWNSER ");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("THIS IS A LOGIN TEST");
    }

    @Test(priority = 3)
    void teardown(){
        System.out.println("CLOSING BROWSER");
    }

    @Test(priority = 4)
    void testExample(){
        System.out.println("THIS IS A LOGIN TEST");
    }

    @Test(priority = 5)
    void TestExampleTwo(){
        System.out.println("CLOSING BROWSER");
    }
}
