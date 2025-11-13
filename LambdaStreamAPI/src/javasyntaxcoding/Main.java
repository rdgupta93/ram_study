package javasyntaxcoding;

public class Main {

    public static void main(String[] args) {
      /*
      Ques 1)
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";
        s1.display();

        Student s2 = s1;
        s2.age = 20;
        s2.name = "B";

        s2.display();

        s1.display();

       */

       /*
       Ques 2
        *
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();

        Student temp = s1;
        s1 = s2;
        s2 = temp;

        s2.display();  // My name is A. I am 10 years old.

        // first s1 - reference is Student@793 and s2 - Student@796 now s1 and s2 interchange
        // s1- Student@796 and s2 - Student@793

        */


         /*
            Student s1 = new Student();
            s1.age = 10;
            s1.name = "A";

            Student s2 = new Student();

            int tempAge = s1.age;
            s1.age = s2.age;
            s2.age = tempAge;

            s2.display();  //My name is null. I am 10 years old


          */

        /*
        Ques)
        Student s1 = new Student();
       s1.age = 10;

       Student s2 = s1;

       s2.display(); //My name is null. I am 10 years old
         */


        /*
        Ques)
          Student s1 = new Student();
       s1.age = 10;
       s1.name = "A";

       Student s2 = new Student();
       s2.age = 20;
       s2.name = "B";

       swap(s1, s2);

       s1.display(); // My name is B. I am 20 years old.

         */

     /*
        Student s1 = new Student();
        s1.age = 10;
        s1.name = "A";

        Student s2 = new Student();
        s2.age = 20;
        s2.name = "B";

        swaps(s1, s2);

        s1.display();  // name "A", age 10.
        // Why the output is NOT "My name is B. I am 20 years old"
        //Java passes object references by value. That means:
        // s1 and s2 are copies of the reference passed to the swaps method.
        // Swapping s1 and s2 inside the method only swaps the local copies, not the original ones in main.

      */


     /*
        Student s1 = new Student();
        s1.name = "A";
        s1.age = 10;

        Student s2 = s1;
        modify(s2);

        System.out.println(s1.name + " " + s1.age); // B 20

      */
    }

    private static void swap(Student s1, Student s2) {
        int tage = s1.age;
        s1.age = s2.age;
        s2.age = tage;

        String tname = s1.name;
        s1.name = s2.name;
        s2.name = tname;
    }

    private static void swaps(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }
    static void modify(Student s) {
        s.age = 20;
        s.name = "B";
    }
}
