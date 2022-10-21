package src.main.java.resources.json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.jackson.JsonGenerationException;
import org.jackson.map.JsonMappingException;
import org.jackson.map.ObjectMapper;

public class AttorneyJson {

    public static void main(String args[]) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", "1");
        jsonObject.put("First_Name", "Saul");
        jsonObject.put("Last_Name", "Goodman");
        jsonObject.put("Practice", "Family Law");
        jsonObject.put("Attorney_type", "Divorce");
        jsonObject.put("Payment_id", "100");
        jsonObject.put("Office_id", "Albuquerque");
        jsonObject.put("Consultation_id", "50");

        try {
            FileWriter file = new FileWriter("E:/Attorneyoutput.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
}