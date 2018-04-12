package anson.zhong;

public class LazyManThreadSafeInnerClass {

    private LazyManThreadSafeInnerClass(){}

    public static class LazyManInnerClass{
        public static final LazyManThreadSafeInnerClass singleton = new LazyManThreadSafeInnerClass();
    }

    public static LazyManThreadSafeInnerClass getSingleton(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return LazyManInnerClass.singleton;
    }
}
