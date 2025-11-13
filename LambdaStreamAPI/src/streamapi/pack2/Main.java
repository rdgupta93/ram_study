package streamapi.pack2;

public class Main {
    public static void main(String[] args) {

//        Implementing Stream API

//        List<String> names = Arrays.asList("John", "janem", "Jacky", "Doep");
//        List<String> name = names.stream().filter(nam->nam.toUpperCase().startsWith("J")).collect(Collectors.toList());
//        List<String> name1 = names.stream().filter(nam->nam.length()>4).collect(Collectors.toList());
//
//        List<Integer> numbers = Arrays.asList(1,2,3,4,6,7,9,8,5,15,10,25,20,12,5);
//        List<Integer> number = numbers.stream().filter(x->x%2==0).dsa.map(x->x*x).sorted().collect(Collectors.toList());
//        List<Integer>nums = numbers.stream().filter(x->x%2==1).dsa.map(x->x*x*x).sorted().collect(Collectors.toList());
//
//       System.out.println(number);
//        System.out.println(nums);
//        System.out.println(name);
//        System.out.println(name1);

//        List<Student>studentList = Arrays.asList(
//             new Student(14,"rohan",43),
//             new Student(17,"shyam",12),
//                new Student(21,"chetan",9),
//                new Student(10,"zadu",62),
//                new Student(30,"Borbal",100)

 //       );



       // Intermediate Operation
        //Filter :- Filters elements based on a condition

 //   List<Integer>numbers = List.of(1,8,3,4,5,6,7,2,9);

   // List<Integer> ans = numbers.stream().filter(num->num%2==0).dsa.map(n->n*2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
 //   List<Integer> ans = numbers.stream().filter(x->x%2==0).dsa.map(y->y*y).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
 //       System.out.println(ans);
//
//    List<Integer> ans1 = numbers.stream().filter(n->n%2==1).dsa.map(n->n*n).sorted().collect(Collectors.toList());
//        List<Integer>ans1 = numbers.stream().filter(x->x%2==1).dsa.map(y->5*y).sorted().collect(Collectors.toList());
//      System.out.println(ans1);

        // Map :-stream.dsa.map(String::toUpperCase);

//      List<String> names1 = Arrays.asList("John", "Alice", "Bob","Rakesh","Rohan");
//        List<String> names = List.of("Rohan","raju","kamlesh","Vimalesh","sachin");
//        List<String>name1 = names.stream().dsa.map(String::toUpperCase).sorted().collect(Collectors.toList());
//        List<String> name = names.stream().dsa.map(String::toLowerCase).sorted().collect(Collectors.toList());
//        List<String>name = names.stream().dsa.map(String::toLowerCase).sorted().collect(Collectors.toList());
//        System.out.println(name1);
//       System.out.println(name);
 //       List<String>name2 = names1.stream().dsa.map(String::toUpperCase).sorted().filter(nam->nam.startsWith("R")).collect(Collectors.toList());
 //       System.out.println(name2);
//
 //       List<Integer>length = names1.stream().dsa.map(String::length).collect(Collectors.toList());
 //       System.out.println(length);
//
 //       List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
 //       List<Integer>number = nums.stream().dsa.map(num->num*num).collect(Collectors.toList());
 //      System.out.println(number);

        // flatMap:  Flattens a stream of collections into a single stream.
        // stream.flatMap(str -> Arrays.stream(str.split(" ")));
//
//        List<List<String>>nestedList = Arrays.asList(
//                Arrays.asList("Mango","Apple"),
//                Arrays.asList("Banana","Papaya","Litchi"),
//                Arrays.asList("BlueBerry","PineApple")
//        );

     //   List<String>list1 = nestedList.stream().flatMap(List::stream).sorted().collect(Collectors.toList());
     //   List<String>list = nestedList.stream().flatMap(List::stream).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    //    System.out.println(list);

        // distinct :- Remove duplicate element ->  stream.distinct();

//        List<Integer> nums = List.of(1,2,3,4,2,3,5,6,7,9,8,3,0,1);
//        List<Integer>number = nums.stream().distinct().collect(Collectors.toList());
//        System.out.println(number);
//
//        List<String> names = Arrays.asList("Alice","Blue","Alice","John","Mango","Blueberry","BlackBerry","Mango");
//        List<String>name = names.stream().distinct().sorted().collect(Collectors.toList());
//        System.out.println(name);
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
//        List<Integer>num = numbers.stream().filter(n->n%2==0).dsa.map(n->n*n).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(num);


        //limit : stream.limit(5);

//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer>nums=numbers.stream().limit(7).collect(Collectors.toList());
//        System.out.println(nums);
//
//        List<String>names =Arrays.asList("Alice","Bob","Charlie","David","Edward","Fakirchand","Girish","Dravid","devgan","dabur");
//        List<String> name = names.stream().dsa.map(String::toLowerCase).filter(names1->names1.startsWith("d")).sorted().limit(2).collect(Collectors.toList());
//        System.out.println(name);
//
//        List<Person> people = Arrays.asList(
//                new Person("Alice", 30),
//                new Person("Bob", 25),
//                new Person("Charlie", 35),
//                new Person("David", 40),
//                new Person("Edward", 45)
//        );
//
//        //List<Person> peoples = people.stream().filter(per->per.getAge()>30).sorted(Comparator.comparing(Person::getAge).reversed()).limit(2).collect(Collectors.toList());
//        List<Person> peoples = people.stream().filter(person->person.getAge()>30).sorted(Comparator.comparing(Person::getAge)).limit(2).collect(Collectors.toList());
//        System.out.println(peoples);
//


        // skip : stream.skip(3);


//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer>num = numbers.stream().skip(3).limit(4).collect(Collectors.toList());
//        System.out.println(num);


       // sorted() :
        //  stream.sorted();
        // stream.sorted(Comparator.reverseOrder());
//        List<Integer> nums = Arrays.asList(1,2,4,6,8,9,12,3);
//        List<Integer>num1 = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(num1);

//        List<String> names = Arrays.asList("John","Alice","Bobby","Carolina","Ginny","Zack");
//        List<String>name = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(name);

//        List<String>sortedByLength = names.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
//        List<String>sortedByLength = names.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
//        System.out.println(sortedByLength);


        // Terminal Operations

        //forEach():--> Iterates over each element.
        // stream.forEach(System.out::println);

//        List<String> names =Arrays.asList("Dog","Cat","Peacock","Hen","Horse");
//        names.stream().forEach(System.out::println);
//        List<Integer> nums = Arrays.asList(1,2,3,7,4,5,9);
//        nums.stream().forEach(n-> System.out.println(n*3));
//
//        Map<Integer,String> dsa.map = new HashMap<>();
//        dsa.map.put(1,"One");
//        dsa.map.put(2,"Two");
//        dsa.map.put(3,"Three");
//
//        dsa.map.entrySet().forEach(entry->System.out.println(entry.getKey() +" "+ entry.getValue()));

        // collect(): Collects elements into a collection (e.g., List, Set). -> toList(),toSet(),toMap()
        // List<Integer> list = stream.collect(Collectors.toList());

//        List<String> names = Arrays.asList("Bob","Cat","Dog","Horse","Zebra");
//        List<String> name = names.stream().collect(Collectors.toList());
//        System.out.println(name);
//
//        List<Integer> nums = Arrays.asList(1,2,3,2,3,4,5,6,4,5,7);
//        Set<Integer>num = nums.stream().collect(Collectors.toSet());
//        System.out.println(num);
//
//        Map<String,Integer> nameLenMap = names.stream().collect(Collectors.toMap(nam->nam,nam->nam.length()));
//        System.out.println(nameLenMap);



          // reduce() :Combines the elements of the stream into a single result using a binary operator (like sum, product, etc.).
        //   int sum = stream.reduce(0, Integer::sum);

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        int sum = numbers.stream().reduce(0,(a,b)->a+b);
//        System.out.println(sum);
//
//        int prod = numbers.stream().reduce(1,(a,b)->a*b);
//        System.out.println(prod);
//
//        Optional<Integer> max = numbers.stream().reduce((a,b)->a>b?a:b);
//        max.ifPresent(val-> System.out.println("max: " +val));

        // count : long count = stream.count();
//        List<String> names = Arrays.asList("Bob","Charlie","Doll","Gary","Jack");
//        long count = names.stream().count();
//        System.out.println(count);

//        long count1 = names.stream().filter(nam->nam.length()>4).count();
//        System.out.println(count1);
//
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 3, 2, 1);
//        long count2 = numbers.stream().distinct().count();
//        System.out.println(count2);


        // min(), max()
//        List<Integer> numbers = Arrays.asList(3, 5, 2, 8, 7);
//        Optional<Integer>min = numbers.stream().min(Integer::compareTo);
//        System.out.println("Min number is : "+min.get());

//        Optional<Integer>max = numbers.stream().max(Integer::compareTo);
//        System.out.println("Max number is : "+max.get());


        // Lambda -> Lambda expressions were introduced in Java 8 as a feature of functional programming
        //They allow you to write cleaner, more concise code by expressing instances of functional interfaces in a single expression.
        //A functional interface is an interface with a single abstract method (SAM), such as Runnable, Callable, or Comparator.
        // Less Boilerplate: Reduces the amount of code, making it concise and readable.
        //Improved Readability: Code becomes more expressive and easier to understand.

//        List<String> names = Arrays.asList("Rohan","Shyam","Akash","Yash");
//        names.forEach(name-> System.out.println(name));

        // Stream and lambda
//        List<Integer> nums = Arrays.asList(1,2,4,7,9,6,0,8,12,13);
//        nums.stream().filter(n->n%2==1).forEach(System.out::println);

    }
}