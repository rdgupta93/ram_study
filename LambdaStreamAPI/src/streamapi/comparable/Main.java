package streamapi.comparable;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Comparable - object are sorted by natural order

        List<Student>studentList = Arrays.asList(
                new Student(14,"Rohan",43),
                new Student(17,"Shyam",12),
               new Student(21,"Lavanya",9),
               new Student(10,"Zainam",62),
                new Student(30,"Biswas",100)
        );

/*
        // natural sorting order
        studentList.sort(null);
        System.out.println(studentList);

*/

/*
        // Without Using Comparable interface (no need to implement comparable interface
        studentList.sort(Comparator.comparing(Student::getRollNo));
        System.out.println(studentList);

*/
/*
        // using the stream api
    List<Student>students = studentList.stream().sorted(Comparator.comparing(Student::getRollNo)).collect(Collectors.toList());
        System.out.println(students);

*/

/*
       // we can also compare without using comparable interface
        studentList.sort(Comparator.comparing(student->student.getName()));
        studentList.sort(Comparator.comparing(Student::getName));
        studentList.sort(Comparator.comparingInt(student->student.getAge()));
        studentList.sort(Comparator.comparing(Student::getAge));
        studentList.sort(Comparator.comparing(student->student.getRollNo()));
        studentList.sort(Comparator.comparing(Student::getRollNo));
 */
    }
}
