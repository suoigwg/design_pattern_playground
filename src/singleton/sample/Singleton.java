package singleton.sample;

/**
 * Created by yishengyang on 29/06/2017.
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is created");
    }
    private static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
}
