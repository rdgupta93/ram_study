package customException.checked;

public class Test {
    static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age Must be 18 or above");
        }
    }
/*
     throw - Khud se error throw karta hai
             - Method ke andar likhate h
             -Ek baar me sirf ek exception throw karega

     Throws -Bata deta hai ki method error throw karega
            -Method ke signature me (upar likha jata hai)
            -Ek ya zyada exceptions throw kar skta h

 */
}
