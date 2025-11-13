package customException.checked;

import static customException.checked.Test.validateAge;

public class Main {
    public static void main(String[] args) {
        //Checked Custom Exception (Extends Exception)
 //For recoverable errors (e.g., file not found, invalid input).
// Must be handled using try-catch or declared with throws.
      try {
          Test test = new Test();
          Test.validateAge(17);
          validateAge(16);

      }catch (InvalidAgeException e){
          System.out.println("Exception: "+ e.getMessage());
      }
    }
}
