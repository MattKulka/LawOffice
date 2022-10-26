package src.main.java.core;
import src.main.java.dao.models.Attorney;
import src.main.java.dao.models.Courthouse;
import src.main.java.dao.models.Payment;
import src.main.java.dao.models.Practice;
import org.apache.logging.log4j.LogManager;
import test.workingTests.SQLConnectionTest;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Thank You for Contacting The Law Offices of Goodman Law ");
        System.out.println("Are You Looking For An Attorney?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        int value = scanner.nextInt();

        switch (value) {

            case 1:
                Attorney.main();
                Courthouse.main();
                Payment.main();
                System.out.println("\n");
                Attorney.setUp();
                System.out.println("\n");
                System.out.println("Thank you for choosing us! Here is a list of our current Attorneys ");
                Attorney.getAttorneysFromDataBase();
                System.out.println("\n");
                Courthouse.setUp();
                System.out.println("\n");
                System.out.println("Here are the available courthouses that our attorneys can work at");
                Courthouse.getCourthousesFromDataBase();
                System.out.println("\n");
                Payment.setUp();
                System.out.println("\n");
                System.out.println("These are the current Payment Methods");
                Payment.getPaymentFromDataBase();
                System.out.println("\n");
                break;

            case 2:
                System.out.println("We will be here when you need one!");
                break;

        }
    }
}
















