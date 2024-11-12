package pure.singleton;

public class SingletonEager {

    private static SingletonEager eager = new SingletonEager();
    
    private SingletonEager(){
        super();
    }
    
    public static SingletonEager getEager(){
        return eager;
    }
}
