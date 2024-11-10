package com.example.bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeListGenerator {
    public static List<Employee> generateEmployeeList(int size) {
        List<Employee> employeeList = new ArrayList<>(size);
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            Employee employee = new Employee();
            employee.setId(i + 1); // Assuming unique IDs
            employee.setFirstName(NameGenerator.generateRandomFirstName());
            employee.setLastName(NameGenerator.generateRandomLastName());
            // employee.setSalary(random.nextDouble() * 100000); // Random salary
            employee.setSalary(500 + random.nextInt(Integer.MAX_VALUE)); // Salary starts from 500 with no upper limit
            employee.setIsPfOpted(random.nextBoolean());
            employee.setDepartment("Department" + random.nextInt(10)); // Example department
            employee.setEmail(employee.getFirstName() + "." + employee.getLastName() + "@xyx.com");
            employee.setDateOfBirth(LocalDate.of(1990 + random.nextInt(30), random.nextInt(12) + 1, random.nextInt(28) + 1));
            employee.setCountry(CountryGenerator.generateRandomCountry());
            employeeList.add(employee);
        }

        return employeeList;
    }
}
