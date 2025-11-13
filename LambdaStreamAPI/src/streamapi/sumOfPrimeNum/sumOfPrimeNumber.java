package streamapi.sumOfPrimeNum;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

public class sumOfPrimeNumber {
    public static void main(String[] args) {
        int n =5;
        // sum of prime number of n
        int sum = IntStream.rangeClosed(2,n).filter(sumOfPrimeNumber::checkPrime).sum();
        System.out.println("Sum is "+sum);
        // sum of even number from 1 to n
        int sum1 = IntStream.rangeClosed(1,n).filter(nums->nums%2==0).sum();
        System.out.println(sum1);

       /* // find the product of all odd num from 1 to n
        int prod = IntStream.rangeClosed(1,n).filter(nums->nums%2==1).reduce(1,(a,b)->a*b);
        System.out.println(prod);
        */

        //count the number divisible by 3 & 5 from 1 to N
        long count = IntStream.rangeClosed(1,n).filter(nums->nums%3==0 && nums%5==0).count();
        System.out.println(count);

        //find the factorial of N using Streams
        int factorial = IntStream.rangeClosed(1,n).reduce(1,(a,b)->a*b);
        System.out.println("Factorial: "+factorial);

        // Check if a given number is prime using Stream API
        boolean isPrime = IntStream.rangeClosed(2, (int) sqrt(n)).allMatch(i->n%i!=0);
        System.out.println(isPrime);

        //Find the sum of squares of first N natural numbers
        int sum2 = IntStream.rangeClosed(1,n).map(nums->nums*nums).sum();
        System.out.println("Sum of first n natural number: "+sum2);

        //Find the sum of digits of a number using Streams
        int N = 1234;
        String str = String.valueOf(N);
        int sum3 =str.chars().map(Character::getNumericValue).sum();
        System.out.println("Sum of digit of N : "+sum3);

        // Find the second largest element in a list using Streams
        List<Integer> list= Arrays.asList(10, 5, 8, 20, 15);
        List<Integer> first =list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        int firstLargest= list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(firstLargest);

        //Find the longest dsa.string from a list of strings
        List<String>list1 = Arrays.asList("Java", "SpringBoot", "StreamAPI", "Hibernate");
        String str1 =list1.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Largest String: "+str1);

        // Find the frequency of each dsa.character in a dsa.string using Streams
        String string ="hello";
        Map<Character,Long> hm = string.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(hm);

    }
    private static boolean checkPrime(int num){
        if(num<2) return false;
        return IntStream.rangeClosed(2,(int) sqrt(num)).allMatch(i->num%i!=0);
    }
}
