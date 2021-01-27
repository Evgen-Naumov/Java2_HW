package Lesson3.hw3.Task1;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ArrWords = new ArrayList<>(Arrays.asList("Adam","Adrian","Andrew","Calvin","Carl",
                "Brian","Douglas","Donald","Adam","Calvin","Edward ","Douglas","Douglas","Douglas"));

        Map<String,Integer> uniqueWord = new HashMap<>();

        String currItem = "";
        Iterator<String> it = ArrWords.iterator();
        while (it.hasNext()) {
            String next = it.next();
            int i = 1;
            if (uniqueWord.containsKey(next)) {
                i = uniqueWord.get(next);
                i++;
            }
            uniqueWord.put(next, i);
        };
        for (Map.Entry<String, Integer> entry : uniqueWord.entrySet()){
            System.out.printf("Имя %s всречается %d раз",entry.getKey(), entry.getValue());
            System.out.println();
        }

    }
}
