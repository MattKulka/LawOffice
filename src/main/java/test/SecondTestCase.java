package test;

import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setup() {
        System.out.println("OPENING BROWNSER ");
    }

    @Test(priority = 2)
    void SearchAttorney() {
        System.out.println("This IS Search Attorney Test");
    }

    @Test(priority = 3)
    void AddAttorney() {
        System.out.println("This is Add Attorney Test");
    }

    @Test(priority = 4)
    void teardown() {
        System.out.println("CLOSING BROWSER");
    }

    @Test(priority = 4)
    void TestExample3() {
        System.out.println("CLOSING BROWSER");
    }
}
