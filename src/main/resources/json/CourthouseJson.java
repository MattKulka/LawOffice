package src.main.java.resources.json;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class CourthouseJson {

    public static void main(String args[]) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("category_id", "1");
        jsonObject.put("Name", "Albuquerque Courthouse");
        jsonObject.put("Attorney_id", "1");

        try {
            FileWriter file = new FileWriter("E:/Courthouseoutput.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("JSON file created: " + jsonObject);
    }
}