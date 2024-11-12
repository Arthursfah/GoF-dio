package pure.singleton;

public class SingletonLazyHolder {

    private static class Holder{
        public static SingletonLazyHolder lazyHolder = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getHolder(){
        return Holder.lazyHolder;
    }
}
