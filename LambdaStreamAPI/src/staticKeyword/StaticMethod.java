package staticKeyword;

public class StaticMethod {
//    Agar koi method static hoti hai, to use call karne ke liye object banane ki zaroorat nahi hoti.
//    Isse direct class ke naam se call kar sakte hain.

    static int square(int num){
        return num*num;
    }
}
/*
 // static method
        int result = StaticMethod.square(5);
        System.out.println(result);
 */