package streamapi.pack1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        List<Employee3> employee3List = Arrays.asList(
              new Employee3("Raju","IT"),
              new Employee3("Rakesh","HR"),
              new Employee3("Vinay","Finance"),
              new Employee3("Rohan","IT"),
              new Employee3("Akash","HR")
        );

        //Department-wise Employees Grouping
        Map<String,List<Employee3>> empMap = employee3List.stream().collect(Collectors.groupingBy(Employee3::getDeptName));

        empMap.forEach((dept,employees)->{
            System.out.println("Department: "+dept);
            employees.forEach(System.out::println);
        });

       // Employee count by dept
        Map<String,Long>empCount = employee3List.stream().collect(Collectors.groupingBy(Employee3::getDeptName,Collectors.counting()));
        empCount.forEach((dept,count)->{
            System.out.println("Department:"+dept+ " "+"Count is : "+count);
        });
    }
}
