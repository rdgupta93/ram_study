package staticKeyword;

public class StaticVariable {
//    Agar kisi variable ko static declare karte hain, to wo class ke saath belong karta hai, na ki kisi specific object ke saath.
//    Iska memory ek hi bar allocate hota hai aur sabhi objects ke liye common hota hai.

   static String companyName = "Tech Corp";
   int empId;

    public StaticVariable(int empId) {
        this.empId = empId;
    }

    void display(){
        System.out.println("EmpId: "+empId +" "+"Company name "+companyName);
    }
}
/*

  StaticVariable staticVariable = new StaticVariable(101);
        StaticVariable staticVariable1 = new StaticVariable(102);

        staticVariable.display();
        staticVariable1.display();

      output :-
      EmpId: 101 Company name Tech Corp
      EmpId: 102 Company name Tech Corp
 */
