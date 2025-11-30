package dsa.util.reverseInt;

public class Main2 {
    public static void main(String[] args) {
        // String Reverse With Leading Zero Remove (Slow but More Flexible)
        /*
        Use when:
        - Input number may contain leading zeros (like "00120" as string)
        - You are dealing with big numbers beyond int range
        - You need string-level control (remove zeros manually)

       Why use this?
       - If input was string, not integer.
       - If "010" → "10" karna hai
       - If you must preserve formatting

       Drawback:
       - Slow
       - Creates multiple strings
       - Not needed if input already integer
         */

        int x =123456000;
        int ans = reverse(x);
        System.out.println("Reverse is : "+ans);
    }

    private static int reverse(int x){
        String str = String.valueOf(x);
        String revStr = new StringBuilder(str).reverse().toString();
        revStr = revStr.replaceFirst("^0+","");
        if(revStr.isEmpty())revStr= "0";
        return Integer.parseInt(revStr);
    }
}
