import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        String text = "Hello world, hello Java! Welcome to Java programming world.";

        // нижний регистр и удаление знаков препинания
        String cleanText = text.toLowerCase().replaceAll("[^a-zа-я0-9\\s]", "");
        String[] words = cleanText.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Уникальные слова и их частота:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}