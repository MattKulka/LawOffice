package test.workingTests;

import org.testng.annotations.Test;
import src.main.java.dao.models.*;

import static org.junit.Assert.assertEquals;

public class FirstTestCase {

    @Test(priority = 1)
    public void getName() throws Exception {
        Attorney saul = new Attorney("Saul");
        assertEquals("Saul",saul.getName());
        System.out.println("Attorney Name - Saul Goodman");
    }

    @Test(priority = 2)
    public void getCity() throws Exception {
        Courthouse albuquerque = new Courthouse("Albuquerque");
        assertEquals("Albuquerque",albuquerque.getCity());
        System.out.println("Office Location - Albuquerque New Mexico");
    }

    @Test(priority = 3)
    public void getPayment_Type() throws Exception {
        Payment cash = new Payment("Cash");
        assertEquals("Cash", cash.getPayment_type());
        System.out.println("Preferred Payment - Cash");
    }

    @Test(priority = 4)
    public void getPractice() throws Exception {
        Practice federal_crime = new Practice("Federal Crimes");
        assertEquals("Federal Crimes",federal_crime.getPractice_type());
        System.out.println("Practice - Federal Crimes");
    }
    @Test(priority = 5)
    public void getSpecialty() throws Exception {
        PracticeType Robbery = new PracticeType("Federal Crimes");
        assertEquals("Federal Crimes",Robbery.getSpecialty());
        System.out.println("Specialty - Robbery");
    }

    @Test(priority = 6)
    public void getOperatingHours() throws Exception {
        OperatingHours hours = new OperatingHours("9-5 MTWTF");
        assertEquals("9-5 MTWTF",hours.getOperating_hours());
        System.out.println("Operating Hours - 9-5 MTWTF");
    }

    @Test(priority = 7)
    public void getTestimonials() throws Exception {
        Testimonials rating = new Testimonials("5 Stars");
        assertEquals("5 Stars",rating.getRating());
        System.out.println("Rating - 5 Stars");
    }


    }





