package dsa.introtoproblemsolving;

import java.util.Arrays;

public class IntroToProblemSolving {
    /*
    - Factor optimization
    - Rotate array [] from right to left
    -logarthmetics basics
    -Total dsa content
    -Habit forming sessions
     */


    // Count factor
    public static int countFactor(int N){
        int count =0;
        for(int i=1;i*i<=N;i++){
            if(N%i==0){
                if(i==N/i){
                    count++;
                }else{
                    count=count+2;
                }
            }

        }
        return count;
    }

    public static int [] reverseRange(int arr[],int s,int e){
        int p1=s,p2=e;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        return arr;
    }

    public static int countPair(char [] ch){
        int n = ch.length;
        int count =0;
        int p =0;
        for(int i=n-1;i>=0;i--){
            if(ch[i]=='g'){
                count++;
            }else if(ch[i]=='a'){
                p =p+count;
            }
        }
        return p;
    }

    public static int countLeader(int arr []){
        int count =1;
        int n = arr.length;
        int leader = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                count++;
                leader =arr[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {

        //Ques 1-
        // Return the factor of N ?
        // if we just iterate i*i<=N , we can get all factor

        int N = 36;// 1,2,3,4,6,9,12,18,36
        System.out.println("Count of number N is :"+countFactor(N));


        // Ques 2-
        // Given an array element ar[N] && index s & e
        //Reverse the array from index[s,e]

        int arr [] = {1,2,3,4,5,6,7,8,9};
        reverseRange(arr,3,7);
        System.out.println(Arrays.toString(arr));

        //Ques 3-
        // Rotate the array from last to first k time // clockwise
        //ar[7] ={3,-2,1,4,6,9,8} -> k =3 ->{6,9,8,3,-2,1,4}
        // steps1-reverse the entire array -reverse arr[0,N-1]
        // steps2 - reverse first k elements -> reverse arr[0,k-1]
        // steps3 - reverse the remaining elements --> reverse arr[k,N-1]

        int [] arr1 ={3,-2,1,4,6,9,8};
        int k =3;
        reverseRange(arr1,0,arr1.length-1);
        reverseRange(arr1,0,k-1);
        reverseRange(arr1,k,arr1.length-1);
        System.out.println(Arrays.toString(arr1));

        // Count pair,Leader in Array, N bulbs
        //Ques
        // Given a char [N],calculate the no. of pairs indices =i,j such that
        //i<j && ch[i]=='a' && ch[j]=='g' All characters are in lower
       //1<=N<=10Pow(5), 'a'<=ch[i]='g'

        char ch [] = {'b','a','a','g','d','c','a','g'};
        // ans =5 --> 1,3 , 2,3 , 1,7,  2,7,  ,6,7

        System.out.println("count pair: "+countPair(ch));

        //Ques
        // leaders in array
        // Given an array , you have to find the number of leaders in arr[N]
        // ar[i] is said to be leader if it is greater than > max of all elements on left from[0,i-1]
        // ar[0] is considered as a leader
        // 1<=N<=10pow(5) 1<=ar[i]<=10pow(9)
        //ar[8] ={3,2,4,5,2,7,-1,15} ans = 3,4,5,7,15 -->5

      int ar[] ={3,2,4,5,2,7,-1,15};
        System.out.println("No of leader: "+countLeader(ar));

    }
}
