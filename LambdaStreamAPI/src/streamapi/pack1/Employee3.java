package streamapi.pack1;

public class Employee3 {
    private String name;
    private String deptName;

    public Employee3(String name, String deptName){
        this.name = name;
        this.deptName = deptName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
