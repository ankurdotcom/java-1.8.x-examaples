package com.example.bank;

import java.util.Comparator;
import java.util.List;

public class OneMillionEmployeeProcessor {

    public static void main(String[] args) {
        List<Employee> oneMillionEmp = EmployeeListGenerator.generateEmployeeList(10000000);

        System.out.println("Total employee Count: " + oneMillionEmp.size() );

        long startTime = System.nanoTime();

        //printEmpCountSalaryHigherThan50000(oneMillionEmp);
        //printEmpCountSalaryGreaterThan50000(oneMillionEmp);
        //printEmpCountSalaryEqual50000(oneMillionEmp);

        // printEmpWithLeastSalary(oneMillionEmp);
        printEmpWithMaxSalary(oneMillionEmp);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Execution Time : " + duration + " nanoseconds");

    }

    private static void printEmpWithMaxSalary(List<Employee> oneMillionEmp) {
        Employee employee = oneMillionEmp.stream().max(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println(" employee with max: " + employee );
    }

    private static void printEmpWithLeastSalary(List<Employee> oneMillionEmp) {
        Employee employee = oneMillionEmp.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);
        System.out.println(" employee with least: " + employee );
    }

    private static void printEmpCountSalaryEqual50000(List<Employee> oneMillionEmp) {
        int count = 0;
        count = (int) oneMillionEmp.parallelStream().filter(e -> e.getSalary() == 50000).count();
        System.out.println(" employee Count: " + count );
    }

    private static void printEmpCountSalaryGreaterThan50000(List<Employee> oneMillionEmp) {
        int count = 0;
        count = (int) oneMillionEmp.parallelStream().filter(e -> e.getSalary() > 50000).count();
        System.out.println(" employee Count: " + count );
    }

    private static void printEmpCountSalaryHigherThan50000(List<Employee> oneMillionEmp) {
        int count = 0;
        count = (int) oneMillionEmp.parallelStream().filter(e -> e.getSalary() < 50000).count();
        System.out.println(" employee Count: " + count );
    }


}
