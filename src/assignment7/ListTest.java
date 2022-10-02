package assignment7;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("SSL Wireless");
        strings.add("Therap LLC");
        strings.add("BRAC IT");
        strings.add("SQA Learning Academy");
        strings.add(null);
        System.out.println("First " + strings.get(0));

        System.out.println("================================");

        for (String s : strings){
            System.out.println(s);
        }

        strings.remove(2);

        System.out.println("================================");

        for (String s : strings){
            System.out.println(s);
        }

        strings.add(2, "Data Edge");

        System.out.println("================================");

        for (String s : strings){
            System.out.println(s);
        }

    }
}
