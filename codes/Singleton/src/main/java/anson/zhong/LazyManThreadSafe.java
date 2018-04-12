package anson.zhong;

public class LazyManThreadSafe {
    private static LazyManThreadSafe singleton;

    private LazyManThreadSafe(){}

    public static synchronized LazyManThreadSafe getSingleton(){
        if (singleton == null){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new LazyManThreadSafe();
        }
        return singleton;
    }
}
