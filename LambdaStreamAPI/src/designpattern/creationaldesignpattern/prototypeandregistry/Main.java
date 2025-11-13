package designpattern.creationaldesignpattern.prototypeandregistry;
/*
Prototype -
Google search also use prototype design pattern
Search template on google -
user - user will remains same
IP- this will be same
path - path of website will be same ie google.co.in
query-  this will keeps on changing.


- Given an object of a class
-We want to create the deep copy of the object // deep copy - exact same value for all attributes

Approach 1 -
Student st =Student object
Student copy = new student();
copy.setId(original.getId());
copy.setName(original.getName());

Issue - Whenever we need to create a copy , we need to write copy logic for all attributes
any changes in attributes will lead to change in copy logic
- Hidden attributes - private and need to provided getter and setter for copy


Definitions -
there are a scenarios where we dont want to create an entire object from scratch
rather we prefer creating a copy from template and update the few attributes



 */

public class Main {
    public static void main(String[] args) {

        // prototype

        Student studentPrototype = new Student("2023","BatchA","LLD","Sandeep","12 dec 2023","TTS","30 Apr 2024");
        System.out.println(studentPrototype);

        Student studentCopy = studentPrototype.clone();
        studentCopy.setName("Ramdayal");
        studentCopy.setEmail("redgupta@yahoo.com");
        studentCopy.setPhoneNumber("7638782830");


        System.out.println(studentCopy);


        // Registry Design Patter

        //Since, a single prototype will not work for all the batches( we need batch A,batch B etc....), we need to have
        // multiple prototypes for each batch, hence need to maintain this is a datastructure

        Student studentPrototypeBatchA = new Student("2023", "BatchA", "HLD", "Sandeep", "12-June-23", "MWF", "30-Apr-2024");
        Student studentPrototypeBatchB = new Student("2023", "BatchB", "LLD", "naman", "12-Dec-23", "TTS", "30-June-2024");
        Student studentPrototypeBatchC = new Student("2024", "BatchC", "DSA", "mohit", "12-Jan-24", "MWF Morning", "30-Dec-2024");

        //  Registry Design pattern comes into play as it contains a hashmap, that stores all the
        //  prototypes of a class, which can fetched using a specific key, whenever required
        // Registry is help to maintain the registry

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.add(studentPrototypeBatchA);
        studentRegistry.add(studentPrototypeBatchB);
        studentRegistry.add(studentPrototypeBatchC);


        // enroll -> Kunal, k@email.com, 123456 -> BatchB
        Student kunal = studentRegistry.get("BatchB").clone();
        kunal.setName("Kunal");
        kunal.setEmail("kunal@gmail.com");
        kunal.setPhoneNumber("1238478380");

        System.out.println(kunal);
    }
}
