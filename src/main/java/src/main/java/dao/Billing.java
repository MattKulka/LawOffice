package src.main.java.dao;

public class Billing {

    private static String PaymentType;
    private static Double HourlyFee;
    private static Double MiscFees;
    private static String TotalFees;

    private static Integer Hours;

    public static void main(String[] args) {



        TotalFees = String.valueOf((HourlyFee * Hours) + MiscFees);



    }

}
