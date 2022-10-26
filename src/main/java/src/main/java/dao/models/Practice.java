package src.main.java.dao.models;

public class Practice {

    private String practice_type;
    public Practice(String practice_type) {
        this.practice_type = practice_type;
    }
    public String getPractice_type() {
        return practice_type;
    }


    public static void main(String[] args) {


        String[] Category = new String[3];
        String[] FLCrimes = new String[5];
        String[] TVCrimes = new String[5];
        String[] FedCrimes = new String[5];

        Category[0] = "Family Law";
        Category[1] = "Traffic Violations";
        Category[2] = "Federal Crimes";

        FLCrimes[0] = "Divorce";
        FLCrimes[1] = "Adoption";
        FLCrimes[2] = "Guardianship";
        FLCrimes[3] = "Domestic Abuse";
        FLCrimes[4] = "Child Abuse";

        TVCrimes[0] = "Speeding Ticket";
        TVCrimes[1] = "Parking Violation";
        TVCrimes[2] = "Reckless Operation";
        TVCrimes[3] = "DUI";
        TVCrimes[4] = "Street Racing";

        FedCrimes[0] = "Money Laundering";
        FedCrimes[1] = "Kidnapping";
        FedCrimes[2] = "Identity Theft";
        FedCrimes[3] = "Robbery";
        FedCrimes[4] = "Terrorism";



    }
}
