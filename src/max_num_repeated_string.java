import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class max_num_repeated_string {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");

            // Read the input string from the user
            String tr = scanner.nextLine();

            // Normalize the case
            tr = tr.toLowerCase();  // Converts the string to lowercase

            // Use a regular expression to find words
            Pattern pattern = Pattern.compile("\\b\\w+\\b");
            Matcher matcher = pattern.matcher(tr);

            // Count the frequency of each word
            Map<String, Integer> wordCount = new HashMap<>();
            while (matcher.find()) {
                String word = matcher.group();  // Get the current word
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);  // Update the count
            }

            // Find the word(s) with the highest frequency
            int maxCount = 0;
            for (int count : wordCount.values()) {
                if (count > maxCount) {
                    maxCount = count;
                }
            }

            // Collect and print all words with the highest frequency
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                if (entry.getValue() == maxCount) {
                    System.out.println("Most repeated word: " + entry.getKey());  // Print the most repeated word(s)
                }
            }

            // Close the scanner
            scanner.close();
        }
    }
