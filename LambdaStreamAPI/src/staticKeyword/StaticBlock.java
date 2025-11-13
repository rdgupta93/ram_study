package staticKeyword;

public class StaticBlock {
//  Static Block Explanation in Detail
//-Static block tab execute hoti hai jab class load hoti hai, yaani jab class ko pehli
// baar JVM (Java Virtual Machine) me load kiya jata hai.
//-Ek class me multiple static blocks ho sakte hain, aur ye
//    top-to-bottom order me execute hote hain.
//  -Static block ka sirf ek hi baar execution hota hai,
//    chahe aap multiple objects create karein, wo dubara execute nahi hoga.

    static{
        System.out.println("Static Block executed! ");
    }

    public StaticBlock() {
        System.out.println("Constructor executed! ");
    }
}
/*
  // static block
       StaticBlock staticBlock =new StaticBlock();
       StaticBlock staticBlock1 = new StaticBlock();

       output :-
       Static Block executed!
       Constructor executed!
       Constructor executed!
 */
