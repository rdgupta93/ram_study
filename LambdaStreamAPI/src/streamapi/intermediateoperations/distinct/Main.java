package streamapi.intermediateoperations.distinct;

// distinct(): Removes duplicate elements. Returns a new stream with only distinct elements.
//               stream.distinct();

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,1,2,3);
      //  List<Integer>unique = list.stream().distinct().collect(Collectors.toList());
        List<Integer>unique = list.stream().distinct().collect(Collectors.toList());
        System.out.println(unique);

    }
}
