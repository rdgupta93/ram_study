package PriorityQueue;

public class PriorityQueue {
/*
- A Priority Queue in Java is a special type of queue where elements are processed based on their
priority rather than the order in which they were added.

- Java provides a PriorityQueue class that implements the Queue interface and uses a heap data structure internally

     Key Features of PriorityQueue:
     It is part of the java.util package.
     It does not allow null values.
     It does not guarantee FIFO (First In, First Out) ordering.
     The element with the highest priority (or lowest value by default) is served first.
     It is implemented using a min-heap by default (i.e., the smallest element comes first).
     It allows custom ordering using a Comparator.

    1) By default, PriorityQueue in Java is a Min Heap, meaning the smallest element is removed first.

      PriorityQueue<Integer> pq = new PriorityQueue<>();

       pq.add(30);
        pq.add(10);
        pq.add(50);
        pq.add(20);

         while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Output: 10, 20, 30, 50
        }

    2) To create a Max Heap, we use a Comparator that reverses the natural ordering.
      PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements
        maxHeap.add(30);
        maxHeap.add(10);
        maxHeap.add(50);
        maxHeap.add(20);

        // Removing elements (Largest element first)
        while (!maxHeap.isEmpty()) {
            System.out.println(maxHeap.poll()); // Output: 50, 30, 20, 10
        }

        3)PriorityQueue with Custom Comparator (Sorting by String Length)
         PriorityQueue<String> pq = new PriorityQueue<>(Comparator.comparingInt(String::length));

        pq.add("Apple");
        pq.add("Banana");
        pq.add("Kiwi");
        pq.add("Cherry");

        // Removing elements (Shortest string first)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // Output: Kiwi, Apple, Cherry, Banana
        }


        DSA
        Basic Level
 -Kth Largest Element – Find the Kth largest element in an array.
 -Kth Smallest Element – Find the Kth smallest element in an array.
 -Sort K-Sorted Array – Given an array where every element is at most K positions away from its sorted position, sort it.
 -Merge K Sorted Arrays – Merge K sorted arrays into one sorted array.
 -Find Top K Frequent Elements – Given an array, find the top K most frequent elements.
 -Find the Median of a Running Stream – Design a data structure that supports finding the median in a stream of numbers.

 Intermediate Level
 -Connect Ropes to Minimize Cost – Given an array of ropes, merge them with minimum cost.
 -Task Scheduler – Given tasks with cooldown periods, schedule them efficiently.
 -Find the K Closest Elements – Given an array and a target, find the K closest elements to the target.
 -Rearrange String such that no Adjacent Characters are Same – Given a string, rearrange it so that no two adjacent characters are the same.
 -Top K Frequent Words – Given a list of words, return the top K frequent words in lexicographical order in case of ties.
 -K Pairs with Smallest Sums – Given two sorted arrays, find the K pairs with the smallest sum.

 Advanced Level
 -Sliding Window Maximum – Given an array, find the maximum in every sliding window of size K.
 -Merge K Sorted Linked Lists – Merge K sorted linked lists into a single sorted list.
 -Smallest Range in K Lists – Given K sorted lists, find the smallest range that includes at least one number from each list.
 -Find Skyline Problem – Given a list of buildings, find their silhouette (skyline) when viewed from a distance.
 -Minimum Cost to Hire K Workers – Given workers with different quality and wage expectations, find the minimum cost to hire K workers.
 -Dijkstra’s Algorithm – Find the shortest path from a source node to all other nodes in a graph.
 -Prim’s Algorithm (Minimum Spanning Tree) – Find the Minimum Spanning Tree of a weighted graph.
 -Shortest Path in a Grid with Obstacles – Given a grid with obstacles, find the shortest path while at most removing K obstacles.


 */
}
