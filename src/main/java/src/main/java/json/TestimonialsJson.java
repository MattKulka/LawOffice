package src.main.java.json;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class TestimonialsJson {

    public static void main(String args[]) {

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("id", "1");
        jsonObject.put("rating", "10");


        try {
            FileWriter file = new FileWriter("E:/Testimonialsoutput.json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("JSON file created: " + jsonObject);
    }
}