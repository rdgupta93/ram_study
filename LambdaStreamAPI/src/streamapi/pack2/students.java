package streamapi.pack2;

public class students implements Comparable<students> {
    private Integer age;
    private String name;
    private Integer rollNo;

    public students(Integer age, String name, Integer rollNo){
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getRollNo(){
        return rollNo;
    }

    public void setRollNo(Integer rollNo){
        this.rollNo = rollNo;
    }

    public int compareTo(students st){
        return this.age.compareTo(st.age);
    }

}

