package streamapi.pack2;

import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(new Fruit("Apple","Red"));
        fruitList.add(new Fruit("Orange","Orange"));
        fruitList.add(new Fruit("Grapes","Green"));
        fruitList.add(new Fruit("Blueberry","Indigo"));
        fruitList.add(new Fruit("Banana","Yellow"));
        fruitList.add(new Fruit("Plum","Olive"));

        List<Fruit>fruitList1 = fruitList.stream().filter(f->startWithVowel(f.getColour())).collect(Collectors.toList());
        fruitList1.forEach(System.out::println);


    }

//    private static boolean startWithVowel(String color){
//        return color.matches("(?i)^[AEIOU].*");
//    }

//    private static boolean startWithVowel(String color){
//        return "AEIOU".indexOf(color.toUpperCase().charAt(0))!=-1;
//    }

//    private static boolean startWithVowel(String color){
//        List<Character> vowels = Arrays.asList('A','E','I','O','U');
//        return vowels.contains(Character.toUpperCase(color.charAt(0)));
//    }

    private static boolean startWithVowel(String color){
        Set<Character> hs = Set.of('A','E','I','O','U');
        return hs.contains(Character.toUpperCase(color.charAt(0)));
    }

}
