package assignment7;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<>();
        maps.put("Institution", "BRAC University");
        maps.put("Country", "Bangladesh");
        maps.put("City", "Dhaka");
        System.out.println("================================");
        System.out.println(maps);
        System.out.println(maps.get("City"));

        Map<String, Object> json = new HashMap<>();
        json.put("ID", 12345);
        json.put("Name", "Ali Ahsan");
        json.put("E-Mail", "abc@gmail.com");
        System.out.println("================================");
        System.out.println(json);
        json.remove("E-Mail");
        System.out.println("================================");
        System.out.println(json);

    }
}
