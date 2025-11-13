package dsa.recursion;

public class Main {


    // Sum of first n natural number
    public static int sum(int N){
        if(N==1){return 1;}
        return sum(N-1)+N;
    }

    // Given N Calculate And return the factorial of N
    public static int factorial(int N){
        if(N==0 || N==1){
            return 1;
        }
        return factorial(N-1)*N;
    }

    // Given N , Calculate and return Nth fibanacci number
    public static int fibanacci(int N){
        if(N==0 || N==1){
            return N;
        }
        return fibanacci(N-1)+fibanacci(N-2);
    }

    public static void Inc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        Inc(n-1);
        System.out.println(n);
    }

    public static void Dec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Dec(n-1);
    }


    public static boolean isPalindrom(char[] str, int s, int e){
        if(s>e){return true;}
        if(str[s]==str[e] && isPalindrom(str,s+1,e-1) ){
            return true;
        }
       else{ return false;}
    }

    // reverse String
    public static void printReverse(String str,int n){
        if(n==0){
           // System.out.println(str.charAt(n));
            return;
        }
        System.out.println(str.charAt(n-1));
        printReverse(str,n-1);
    }

    // normal print
    public static void printNormal(String str,int n){
        if(n==0){
            return;
        }
        printNormal(str,n-1);
        System.out.println(str.charAt(n-1));
    }

    // calculate the a to power n  like 2 power 5 = 32
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        return pow(a,n-1)*a;
    }

    //Given a number A, we need to find the sum of its digits using dsa.recursion.
    public static int digitSum(int n ){
        if(n==0){
            return 0;
        }
        return n%10+digitSum(n/10);
    }

    // Given a number A, check if it is a magic number or not.
    public static int solve(int A){
        if(A<10){
            return A==1?1:0;
        }
        int sum = sumOfDigits(A);
        return solve(sum);
    }
    private static int sumOfDigits(int A){
        if(A==0){
            return 0;
        }
        return A%10 +sumOfDigits(A/10);
    }

    public static void main(String[] args) {


        // Sum of first n natural number
        int N =9;
        int result = sum(N);
        System.out.println("Sum of first "+N +" natural number is: "+result);

        // Given N Calculate And return the factorial of N
        int n = 10;
        int fact = factorial(n);
        System.out.println("Factorial of N is: "+fact);

        // Given N , Calculate and return Nth fibanacci number
                   // 0       1       2        3       4     5         6        7       8
        // Series =   0       1      1        2         3     5        8         13     21

        int n1 = 8;
        int fib = fibanacci(n1);
        System.out.println("fibanacci of number: "+n1+" is : "+fib);

        // Given n print the number in increasing order --> n =5 -> 1,2,3,4,5
        // inc(5) = 1,2,3,4,5  or = inc(4) print(5) --> inc(N-1) print(N)
        //int n2 = 5;
        System.out.println("This is increasing sequence number:-");
        Inc(8);

        //Given n print the number in decreasing order --> n =5 -> 5,4,3,2,1
        //dec(5) = 5,4,3,2,1 or print(5) dec(4) --> print(N) dec(N-1)
        System.out.println("This is decreasing sequence number:- ");
        Dec(5);

        // Given a subString,Check if its a palindrome or not
                                     //  0  1  2  3  4  5  6  7  8  9  10 11
        String str = "gooedabadedf"; //  g  o  o  e  d  a  b  a  d  e  d  f
        char []ch = str.toCharArray();
        System.out.println(isPalindrom(ch,3,10));

        // print the reverse String
        // String str = "cool" --> looc
        String str1 ="cool";
        printReverse(str1,str1.length());

        // print the dsa.string normal
        // String str = cool --> c o o l
        String str2 ="cool";
        printNormal(str2,str2.length());

        // calculate the a to power n  like 2 power 5 = 32
        int ans = pow(6,8);
        System.out.println(ans);


        //Given a number A, we need to find the sum of its digits using dsa.recursion.
        //1 <= A <= 109
        System.out.println(digitSum(4687));

        // Given a number A, check if it is a magic number or not.
        //A number is said to be a magic number if the sum of its digits is calculated
        //till a single digit recursively by adding the sum of the digits after every addition. If the single
        //digit comes out to be 1, then the number is a magic number.
        // Problem Constraints - 1 <= A <= 109
        //Input 1 -> A = 83557 ans =1 sum(83557) = sum(28) = sum(10) = 1
        // input 2->  A = 1291  ans =0  sum(1291) =sum(13) = 4

        System.out.println(solve(83557));

        // solving number A magic number or not using iterative
        int A = 83556;   //83557
        while(A>9){
            A=sumOfDigit(A);
        }
        System.out.println(A==1?1:0);
    }
    public static int sumOfDigit(int A){
        int sum =0;
        while(A>0){
            sum = sum+A%10;
            A=A/10;
        }
        return sum;
    }
}
