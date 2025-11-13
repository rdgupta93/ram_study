package PriorityQueue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
      /*
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(40);
        pq.add(20);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        PriorityQueue<Integer>pq1 = new PriorityQueue<>(Collections.reverseOrder());
        pq1.add(30);
        pq1.add(10);
        pq1.add(40);
        pq1.add(20);
        while(!pq1.isEmpty()){
            System.out.println(pq1.poll());
        }

        PriorityQueue<String> pq2 = new PriorityQueue<>(Comparator.comparingInt(String::length));
        pq2.add("Apple");
        pq2.add("Banana");
        pq2.add("Kiwi");
        pq2.add("Cherry");

        while(!pq2.isEmpty()){
            System.out.println(pq2.poll());
        }

       */

        /*
        //Given an array of integers and an integer K, find the Kth largest element in the array.
        //The array may contain duplicate elements.
        //The elements are not necessarily sorted.
        //K is always a valid index (1 ≤ K ≤ array.length).

        //nums = [3, 2, 1, 5, 6, 4], K = 2    ans =5         // length =6 k =2  remove till 4
        int num [] = {7, 10, 4, 3, 20, 15};
        int k =3;
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int nums:num){
            pq.add(nums);
        }
        int i=0;
        while(i<k-1 && !pq.isEmpty()){
            pq.poll();
            i++;
        }
        System.out.println(pq.peek());

        for(int n:num){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());

         */


        //Given an array of integers and an integer K, find the Kth smallest element in the array.
       //An array of N integers.
        //An integer K (1 ≤ K ≤ N).
        //arr = [7, 10, 4, 3, 20, 15]  and k =3   Ans =7

        int arr [] = {12, 3, 5, 7, 19};
        int k =2;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int n:arr){
            pq.add(n);
            if(pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq.peek());
    }
}
