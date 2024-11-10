package com.example.bank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/***
 * We need to find the top N frequently occurring words in a given text file.
 * This is a common problem in text analysis, where we often need to analyze large bodies of text (e.g., logs, articles, books) and determine the most frequently occurring words.
 */
public class TopNWordsFinder {

    public static void main(String[] args) {
        String filePath = "input.txt";  // Replace with the path to your text file
        int N = 5;  // Number of top frequent words to find

        Map<String, Integer> wordCountMap = countWordFrequency(filePath);
        List<Entry<String, Integer>> topNWords = findTopNWords(wordCountMap, N);

        System.out.println("Top " + N + " most frequent words:");
        for (Entry<String, Integer> entry : topNWords) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Method to count word frequency from a file
    public static Map<String, Integer> countWordFrequency(String filePath) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        return wordCountMap;
    }

    // Method to find the top N frequent words from the word count map
    public static List<Entry<String, Integer>> findTopNWords(Map<String, Integer> wordCountMap, int N) {
        return wordCountMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))  // Sort by value in descending order
                .limit(N)  // Limit to top N
                .collect(Collectors.toList());
    }
}

