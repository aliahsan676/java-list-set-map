package assignment7;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();

        integers.add(42);
        integers.add(76);
        integers.add(42);
        integers.add(21);

        for (Integer integer : integers){
            System.out.println(integer);
        }

        integers.add(96);
        integers.remove(42);

        System.out.println("================================");

        for (Integer integer : integers){
            System.out.println(integer);
        }



    }
}
