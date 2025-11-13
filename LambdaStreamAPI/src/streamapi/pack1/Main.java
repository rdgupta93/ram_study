package streamapi.pack1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee>empList = new ArrayList<>();
            empList.add(new Employee("Amit", "Delhi"));
            empList.add( new Employee("Rahul", "Mumbai"));
            empList.add( new Employee("Sita", "Delhi"));
            empList.add( new Employee("John", "Bangalore"));
            empList.add(new Employee("Priya", "Mumbai"));
            empList.add(new Employee("Arjun", "Hyderbad"));


           // Get Unique Cities from a List of Employees

          List<String> uniqueCity = empList.stream().map(emp->emp.city).distinct().collect(Collectors.toList());
          uniqueCity.forEach(System.out::println);

          //Find Employees Having Name Starting with "A"
          List<Employee> names = empList.stream().filter(emp->emp.getName().startsWith("A")).collect(Collectors.toList());
          names.forEach(System.out::println);
          List<String>name =names.stream().filter(emp->emp.getName().startsWith("A")).map(Employee::getName).collect(Collectors.toList());
        System.out.println(name);

         // Concatenate All Employee Names into a Single String

        String names1 = empList.stream().map(emp->emp.getName()).collect(Collectors.joining(", "));
        System.out.println(names1);

        List<String>names2 = empList.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(names2);

    }
}
