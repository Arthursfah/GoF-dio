package pure.singleton;

public class SingletonLazy {

    private static SingletonLazy lazy;

    SingletonLazy(){
        super();
    }

    public static SingletonLazy getLazy(){
        if(lazy == null){
            lazy = new SingletonLazy();
        }
        return lazy;
    }
}
