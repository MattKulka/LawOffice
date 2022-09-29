package src.main.java.json;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class BillingJson {

    public static void main(String args[]) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", "1");
        jsonObject.put("Base_cost", "100");
        jsonObject.put("Hourly_rate", "50");
        jsonObject.put("Billingcol", " ");
        jsonObject.put("Payment_id", "1");

        try {
            FileWriter file = new FileWriter("E:/Billingoutput.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("JSON file created: " + jsonObject);
    }
}
