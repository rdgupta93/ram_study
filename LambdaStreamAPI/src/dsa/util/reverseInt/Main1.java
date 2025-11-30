package dsa.util.reverseInt;

public class Main1 {

    public static void main(String[] args) {
        // Reverse the Integer
        /*
        Best for Competitive Programming & LeetCode
        Use when:
        -Input guaranteed positive integer (like 1 <= nums[i] <= 1e9)
        - No leading zero problem (because int computation automatically removes zero)
        -High performance needed

        Why use this?
        - Super fast (O(log x))
        - No string creation
        - Perfect for constraints like 1e5 numbers
         */
        int x = 123456;
        int ans = reverse(x);
        System.out.println("Reverse is: "+ans);
    }

    private static int reverse(int x){
        int rev =0;
        while(x>0){
            int lastDigit = x%10;
            rev = rev * 10;
            rev = rev + lastDigit;
            x =x/10;
        }
        return rev;
    }
}
