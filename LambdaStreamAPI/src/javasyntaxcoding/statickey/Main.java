package javasyntaxcoding.statickey;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Ques
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println(Counter.count); //3
        // count is declared as static, so it's shared across all instances of Counter.
        //Whenever you create a new object using new Counter(), the constructor runs, which does count++.


        //Ques - Q: Will this throw a NullPointerException?

        Test t = null;
        t.show();   // Hello
        // `static` method class se bind hoti hai, object se nahi. Null hone ke baad bhi call ho jati hai.


        //Ques -
        A a = new A(); //Static Block A
        B b = new B();  //Static Block B



        // Ques Static and Instance Mixing
        Company com1 = new Company();
        com1.employee = "Alice";

        Company com2 = new Company();
        com2.employee = "Bob";

        com1.show();
        com2.show();

        Company.companyName = "Microsoft";

        com1.show();
        com2.show();

        // Ques - Static Method Overriding?

        Parent p = new Child();
        p.show(); //Parent
        //Type of Method - static - Method hiding (resolved using reference type)
        // non-static - Method overriding (resolved using object type at runtime)

        //Ques - Static methods in interfaces are not inherited by implementing classes.

        Utility.printMessage(); // Hello from Utility


        // Ques - Think: What does final mean for a reference type in Java?
        final List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Python");
        System.out.println(names);
      //  names = new ArrayList<>(); - Uncommenting the below line will cause a compile-time error
        // output- [Java, Python]



    }
}
