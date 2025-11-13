package streamapi.pack2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main1 {
    public static void main(String[] args) {
       List<Employee> employeeList = new ArrayList<>();
       employeeList.add(new Employee(3,"Rohan",45000.00));
       employeeList.add(new Employee(20,"Sohan",56000.00));
       employeeList.add(new Employee(105,"Shyam",69000.00));

       // sorting employee by salary

        List<Employee> employeeList1 = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        employeeList1.forEach(System.out::println);
        List<Employee>employeeList2 = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        employeeList2.forEach(System.out::println);

        // filter based on salary where >50000

        List<Employee>employeeList3 = employeeList.stream().filter(sala->sala.getSalary()>50000).collect(Collectors.toList());
        employeeList3.forEach(System.out::println);

        List<String> names = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        names.forEach(System.out::println);

        //Optional
        Optional<Employee>employee=employeeList.stream().filter(e->e.getId()==20).findFirst();
        employee.ifPresent(System.out::println);

        //salary greater than 40000
        long count = employeeList.stream().filter(e->e.getSalary()>40000).count();
        System.out.println("Salary greater than 40000 number of emp: "+count);

        //Total salary
        double salary = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("Total Salary : "+salary);
    }


}
