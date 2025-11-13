package streamapi.pack1;

import java.util.*;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
        List<Employee1>employee1List = Arrays.asList(
                new Employee1("Amit", 70000),
                new Employee1("Rahul", 90000),
                new Employee1("Sita", 80000),
                new Employee1("John", 95000),
                new Employee1("Priya", 88000)
        );

        //  Find Maximum Salary from a List of Employees
        OptionalDouble salary = employee1List.stream().mapToDouble(Employee1::getSalary).max();
        System.out.println(salary);

        Employee1 maxSalary = employee1List.stream().max(Comparator.comparingDouble(emp->emp.getSalary())).orElse(null);
        System.out.println(maxSalary.getSalary());
        System.out.println("Highest salary: "+maxSalary.getName()+" - "+maxSalary.getSalary());

        // min salary
        Employee1 employee1 = employee1List.stream().min(Comparator.comparingDouble(sal->sal.getSalary())).orElse(null);
        System.out.println("Lowest salary: "+employee1.getName() +"  "+employee1.getSalary());

        // Sort Employees by Salary in Descending Order
        List<Employee1> employee1List1 = employee1List.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(employee1List1);
        employee1List1.forEach(emp->System.out.println(emp.getName() +" Salary "+emp.getSalary()));

        //Partition Employees into Two Groups - Salary Above & Below 80K
        Map<Boolean,List<Employee1>> salaryPartition = employee1List.stream().collect(Collectors.partitioningBy(emp->emp.getSalary()>=80000));
        System.out.println("Employee with salary >=80000 "+salaryPartition.get(true));
        System.out.println("Employee with salary less than 80000 "+salaryPartition.get(false));

        // find the second highest salary
        Optional<Employee1> employee2 = employee1List.stream().sorted(Comparator.comparingDouble(Employee1::getSalary).reversed()).skip(1).findFirst();
        System.out.println("Second highest salary is :"+employee2.get().getSalary()+" and Name is: "+employee2.get().getName());

        // Employees ka Average Salary Find Karna
        double avgSalary = employee1List.stream().mapToDouble(Employee1::getSalary).average().orElse(0.0);
        System.out.println("Average salary of employee: "+avgSalary);


        // Employee Names ko Alphabetically Join Karna
        String alphaName = employee1List.stream().map(Employee1::getName).sorted().collect(Collectors.joining(", "));
        System.out.println("Name joined in alphabetical order: "+alphaName);

        // Employees Ka Total Salary Calculation
        double totalEmpSalary = employee1List.stream().mapToDouble(Employee1::getSalary).sum();
        System.out.println("Total employee salary is: "+totalEmpSalary);

        //Employees ke First 3 Letters of Name Extract Karna
        List<String>emp3letter = employee1List.stream().map(emp->emp.getName().substring(0,Math.min(3,emp.getName().length()))).collect(Collectors.toList());
        System.out.println("Emp first 3 letter : "+emp3letter);

        //Employees List ko Name-Wise Partition Karna
        Map<Boolean,List<Employee1>>empNameWisePart = employee1List.stream().collect(Collectors.partitioningBy(emp->emp.getName().charAt(0)<'N'));
        System.out.println("Employee name start from A to M is: "+empNameWisePart.get(true));
        System.out.println("Employee name start from N to Z is: "+empNameWisePart.get(false));

        //Employees ki Salary Increment Karna (10%)
        List<Employee1> salaryIncreasedBy10 = employee1List.stream().map(emp->new Employee1(emp.getName(),emp.getSalary()*1.1)).collect(Collectors.toList());
        System.out.println("Ten % salary increased: "+salaryIncreasedBy10);


    }
}
