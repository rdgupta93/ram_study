package interfaces;

public interface Interface1 {
    default void greet(){
        System.out.println("Hello world");
    }
}
