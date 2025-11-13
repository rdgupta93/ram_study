package streamapi.pack1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Employee2>employee2List = Arrays.asList(
                new Employee2("Amit", "HR",70000),
                new Employee2("Rahul", "IT",90000),
                new Employee2("Sita", "Finance",80000),
                new Employee2("John", "HR",95000),
                new Employee2("Priya", "IT",88000),
                new Employee2("Roshni", "Finance",68000)
        );

        // Employees ka Average Salary Find Karna -Department wise
        Map<String,Double> avgSalaryByDept = employee2List.stream().collect(Collectors.groupingBy(Employee2::getDeptName,Collectors.averagingDouble(Employee2::getSalary)));
        avgSalaryByDept.forEach((dept,sal)->{
            System.out.println("Department name: "+dept+" "+"Average salary is "+sal);
        });

        // Employees ko Name-Wise Sorting Karna
        List<String>empName = employee2List.stream().map(Employee2::getName).sorted().collect(Collectors.toList());
        System.out.println(empName);
    }
}
