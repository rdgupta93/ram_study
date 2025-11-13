package streamapi.comparator;

import streamapi.comparable.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // comparator based on multiple condition


        List<Student> studentList = Arrays.asList(
                new Student(14,"Rohan",43),
                new Student(17,"Shyam",12),
                new Student(21,"Lavanya",9),
                new Student(10,"Zainam",62),
                new Student(30,"Biswas",100)
        );
        // based on name
        List<Student>student1 = studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(student1);

        // based on age
        List<Student>student2 = studentList.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
       // List<Student>student2 = studentList.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        System.out.println(student2);

        // based on roll no
        List<Student>student3 = studentList.stream().sorted(Comparator.comparing(Student::getRollNo)).collect(Collectors.toList());
        System.out.println(student3);

        // based on multiple condition first name,then age and then roll no.
       // List<Student>student4 = studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge).thenComparing(Student::getRollNo)).collect(Collectors.toList());
        List<Student>student4 = studentList.stream().sorted(Comparator.comparing(Student::getName).thenComparing(Student::getAge).thenComparing(Student::getRollNo)).collect(Collectors.toList());
        System.out.println(student4);
    }
}
