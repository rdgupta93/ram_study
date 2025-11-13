package interfaces;

public interface Interface2 {
    default void greet(){
        System.out.println("Hello world");
    }
}
