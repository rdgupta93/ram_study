package streamapi.intermediateoperations;

public class IntermediateOperationsNotes {
    /*

    Stream API -
    -introduced in Java 8
    -perform operations on collections of data

    1. Intermediate Operations (Lazy) :- Intermediate operations transform a stream into another stream. They are lazy,
    meaning they do not process the stream until a terminal operation is executed.

    filter(): Filters elements based on a condition.Returns a new stream containing only the elements that match the condition.
              stream.filter(x -> x > 10);

    map(): Transforms each element of the stream. Returns a new stream where each element is the result of applying the function.
           stream.dsa.map(String::toUpperCase);

    flatMap(): Flattens a stream of collections into a single stream.
              It flattens the nested streams into a single stream.
              stream.flatMap(str -> Arrays.stream(str.split(" ")));

    distinct(): Removes duplicate elements. Returns a new stream with only distinct elements.
               stream.distinct();

    sorted(): Sorts the elements of the stream.By default, it sorts in natural order (ascending for numbers, alphabetically for strings).
              provide a comparator for custom sorting.
              stream.sorted();
              stream.sorted(Comparator.reverseOrder());

    peek(): Performs an action on each element of the stream (similar to forEach).
           stream.peek(System.out::println);

    limit(): Limits the number of elements in the stream to the specified size.
            Returns a new stream with a maximum of the given number of elements.
           stream.limit(5);

    skip() : Skips the first n elements of the stream.
            Returns a new stream that excludes the first n elements.
            stream.skip(3);
     */
}
