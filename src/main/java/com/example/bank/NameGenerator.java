package com.example.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NameGenerator {
    private static final List<String> firstNames = List.of("John", "Jane", "Michael", "Emily", "Christopher", "Olivia", "William", "Ava", "David", "Sophia", "James", "Isabella", "Robert", "Mia", "George", "Charlotte", "Thomas", "Amelia", "Daniel", "Evelyn");
    private static final List<String> lastNames = List.of("Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson", "Martinez", "Anderson", "Taylor", "Thomas", "Moore", "Jackson", "White", "Lee", "Harris", "Clark");

    public static String generateRandomFirstName() {
        Random random = new Random();
        return firstNames.get(random.nextInt(firstNames.size()));
    }

    public static String generateRandomLastName() {
        Random random = new Random();
        return lastNames.get(random.nextInt(lastNames.size()));
    }
}
