package streamapi.comparator;

public class Student {
    private Integer age;
    private String name;
    private Integer rollNo;

    public Student(Integer age, String name, Integer rollNo) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getter and Setter


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
