package designpattern.creationaldesignpattern.singleton;

public class SingletonSynchronized {

    private static  SingletonSynchronized instance;

    private SingletonSynchronized(){

    }


    public static SingletonSynchronized getInstance(){
        if(instance==null){
            synchronized(SingletonSynchronized.getInstance()){
                if (instance==null){
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}
