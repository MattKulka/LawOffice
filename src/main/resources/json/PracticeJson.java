package src.main.java.resources.json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
public class PracticeJson {
    public static void main(String args[]) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("category_id", "1");
        jsonObject.put("name", "Family Law");

        try {
            FileWriter file = new FileWriter("E:/Practiceoutput.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
}