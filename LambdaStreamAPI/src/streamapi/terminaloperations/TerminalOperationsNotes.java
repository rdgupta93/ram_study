package streamapi.terminaloperations;

public class TerminalOperationsNotes {

    /*
    2. Terminal Operations (Eager) :-
    Terminal operations produce a result or a side effect and trigger the processing of the stream. Once
    a terminal operation is invoked, the stream pipeline is consumed, and it can no longer be used.

    forEach(): Iterates over each element.
              stream.forEach(System.out::println);

    collect(): Collects elements into a collection (e.g., List, Set).
              List<Integer> list = stream.collect(Collectors.toList());

    reduce(): Combines the elements of the stream into a single result using a binary operator (like sum, product, etc.).
            int sum = stream.reduce(0, Integer::sum);

    count(): Returns the number of elements in the stream.
            long count = stream.count();

    anyMatch(), allMatch(), noneMatch(): Check if any/all/none elements match a condition.

    min(), max(): Finds the minimum or maximum element based on a comparator.


     */
}
