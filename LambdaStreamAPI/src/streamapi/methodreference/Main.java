package streamapi.methodreference;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    /*
    Syntax of Method Reference
    ClassName::methodName

      or for instance methods:
      instance::methodName

Types of Method References
1)Reference to a static method
ClassName::staticMethodName

2) Reference to an instance method of a particular object
instance::instanceMethodName
3) Reference to an instance method of an arbitrary object of a particular type
ClassName::instanceMethodName



     */
    public static void main(String[] args) {

        //  1)Reference to a static method

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
        // Using lambda expression
        List<Integer>list1 = numbers.stream().map(s->Integer.parseInt(s)).collect(Collectors.toList());

        // Using method reference to static method
        List<Integer>list2 = numbers.stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(list1);
        System.out.println(list2);

        //Given a list print the number which is staring with number 1

        List<Integer> numbers1 = Arrays.asList(1,12,3,4,15,45,23,189,981,513);
        List<Integer>numbers2 = numbers1.stream().map(String::valueOf).filter(s->s.startsWith("1")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(numbers2);

        // strings to uppercase using method reference
        List<String> words = Arrays.asList("java", "method", "reference", "stream");
        List<String>words1 = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(words1);

        //Modify this to filter only words starting with 'M' or 'S'.
        List<String>words2 = words.stream().filter(s->s.startsWith("s") || s.startsWith("m")).map(String::toUpperCase).collect(Collectors.toList());
        List<String>words3 = words.stream().map(String::toUpperCase).filter(s->s.startsWith("S") || s.startsWith("M")).collect(Collectors.toList());
        System.out.println(words2);

        // 2. Sort a list of integers using method reference
        List<Integer> nums = Arrays.asList(5, 3, 8, 1, 9, 7);
        List<Integer>nums1 = nums.stream().sorted(Integer::compareTo).collect(Collectors.toList());
        System.out.println(nums1);

        // 3. Print all elements of a list using method reference
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(System.out::println);

        // 4. Convert list of integers to strings and collect distinct values
        List<Integer> values = Arrays.asList(10, 20, 20, 30, 40, 10);
        List<String>values1 = values.stream().map(String::valueOf).distinct().collect(Collectors.toList());
        System.out.println(values1);

        //  Sorting using instance method
        List<String> name = Arrays.asList("Charlie", "Alice", "Bob");
        List<String>name1 = name.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println(name1);

        // Find the longest fruit name (using method references and Comparator.comparing)
        List<String> fruits = Arrays.asList("Apple", "Strawberry", "Banana", "Blueberry", "Kiwi");
        Optional<String> fruitName = fruits.stream().max(Comparator.comparing(String::length));
        System.out.println(fruitName);

        // 2. Filter a list of integers to keep only even numbers and print them using method reference
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer>numbers4 = numbers3.stream().filter(n->n%2==0).collect(Collectors.toList());
        numbers4.forEach(System.out::println);

        // 3. Sort a list of strings ignoring case using method reference
        List<String> names1 = Arrays.asList("John", "alice", "Bob");
        List<String>names2 = names1.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println(names2);

        // 4. Convert a list of integers to strings using method reference and collect them
        List<Integer> nums2 = Arrays.asList(10, 20, 30);
        List<String>nums3 = nums2.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(nums3);

        // Convert a list of strings (which represent numbers) to a list of integers using method references and Stream API.
        List<String> stringNumbers = Arrays.asList("10", "20", "30", "40");
        List<Integer>intNumber = stringNumbers.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(intNumber);

        //  Count how many strings in a list start with letter ‘a’ or ‘A’ using method reference
        List<String> fruits1 = Arrays.asList("apple", "banana", "Avocado", "mango");
        long count = fruits1.stream().filter(s->s.startsWith("a") || s.startsWith("A")).count();
        System.out.println(count);

        //8. Convert a list of strings to their lengths using method reference
        List<String> words4 = Arrays.asList("java", "stream", "method");
        List<Integer>length = words4.stream().map(String::length).collect(Collectors.toList());
        System.out.println(length);

        //  Use method reference to sum a list of integers
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4);
        Optional<Integer>sum = numbers5.stream().reduce(Integer::sum);
        System.out.println(sum);

        // Convert list of strings to lowercase using method reference
        List<String> words5 = Arrays.asList("JAVA", "STREAM", "API");
        List<String>words6 = words5.stream().map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(words6);

    }
}

