package dsa.dynamicprogramming;

import java.sql.SQLOutput;
import java.util.Arrays;

class Item{
    int value,weight;
    double ratio;
    Item(int value,int weight){
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value/weight;
    }
}

public class FractionalKnapsack {
    public static void main(String[] args) {
        /*
        Problem Description

Given two integer arrays A and B of size N each which represent
values and weights associated with N items respectively.
Also given an integer C which represents knapsack capacity.
Find out the maximum total value that we can fit in the knapsack.
 If the maximum total value is ans, then return ⌊ans × 100⌋ , i.e., floor of (ans × 100).
NOTE:
You can break an item for maximizing the total value of the knapsack
Problem Constraints
1 <= N <= 105
1 <= A[i], B[i] <= 103
1 <= C <= 103

Input Format :
First argument is an integer array A of size N denoting the values on N items.
Second argument is an integer array B of size N denoting the weights on N items.
Third argument is an integer C denoting the knapsack capacity.

Output Format :
Return a single integer denoting the maximum total value of A such that sum of the
weights of this subset is smaller than or equal to C.

Example Input :
Input 1:
 A = [60, 100, 120]
 B = [10, 20, 30]
 C = 50

  A = [10, 20, 30, 40]
 B = [12, 13, 15, 19]
 C = 10

 Example Output
 Output 1:
 24000
 Output 2:
 2105

         */
//        int[] A ={60, 100, 120};
//        int [] B = {10, 20, 30};
//        int C =50;
        int[] A ={10, 20, 30,40};
        int[] B ={12, 13, 15, 19};
        int C =10;
        int n =A.length;
        Item [] items = new Item[n];
        for(int i=0;i<n;i++){
            items[i] = new Item(A[i],B[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));

        double maxValue=0;
        for(Item item:items){
            if(item.weight<=C){
                maxValue = maxValue+item.value;
                C = C-item.weight;
            }else{
                System.out.println("else part");
                // fraction part
                double fraction = (double) C/item.weight;
                System.out.println("fraction "+fraction);
                System.out.println("else part maxValue "+maxValue);
                maxValue =maxValue+fraction*item.value;
                System.out.println("else part after maxValue: "+maxValue);
                break;
            }
            System.out.println("each iteration maxValue: "+maxValue);
            System.out.println("C after each iteration: "+C);
        }

        System.out.println("maximum value is : "+maxValue*100);
    }
}
