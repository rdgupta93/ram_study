package Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*
        Iterator
      Iterator is a interface which is available at java.util file
      it is used to iterate on Collections (Like ArrayList, LinkedList, HashSet, etc.)
      and it is iterate on this sequentially
      it is used only when we wish to fetched the elements without using the indexing

      How to use Iterator
      1) Create the Collections(like ArrayList, HashSet, etc.).
      2) Create the Iterator using Iterator method
      3) run the loop and access the element using hasNext() and next() methods.

      hasNext()-> Check karta hai ki collection me next element available hai ya nahi (true/false).
      next()-> Next element ko return karta hai aur iterator ko next position pe move karta hai.
      remove()-> Last accessed element ko remove karta hai (optional operation).
       */
      /*
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Rajiv");
        names.add("Suraj");
        names.add("Kishor");

        Iterator<String>itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        Iterator<Integer>itr1 = numbers.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

       */

        /*
        //1. LinkedList ke sath Iterator
        LinkedList<String>cities = new LinkedList<>();
        cities.add("Chennai");
        cities.add("Mumbai");
        cities.add("Delhi");

        Iterator<String>itr = cities.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

         */
        /*
       // iterator with stack
       Stack<String> stack = new Stack<>();
       stack.push("first");
       stack.push("second");
       stack.push("third");

       Iterator<String>itr = stack.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
       }

         */
       /*
        //Iterator with HashSet
        Set<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("three");

        Iterator<String>itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        */

        /*
        // Iterator with LinkedHashSet - Insertion order will be maintained
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(5);

        Iterator<Integer>itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        */

        /*
        // Iterator with TreeSet - Maintained the ascending order or Lexographical order
        Set<String>treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Papaya");
        treeSet.add("Mango");
        treeSet.add("Apple");
        Iterator<String>itr = treeSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
         */

        // Iterator with Queue -PriorityQueue
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(40);
        queue.add(30);
        queue.add(20);
        queue.add(10);
        queue.add(5);
        Iterator<Integer>itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
