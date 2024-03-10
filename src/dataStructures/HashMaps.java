package dataStructures;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> numberMapping = new HashMap<>();

        // Adding key-value pairs to a HashMap
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        System.out.println(numberMapping);

        for (String key : numberMapping.keySet()) {
            Integer value = numberMapping.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }

        numberMapping.forEach(
                (key, value)
                -> System.out.println(key + " = " + value));
    }
}
