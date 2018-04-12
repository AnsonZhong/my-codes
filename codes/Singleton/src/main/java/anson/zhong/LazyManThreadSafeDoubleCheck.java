package anson.zhong;

public class LazyManThreadSafeDoubleCheck {
    private static LazyManThreadSafeDoubleCheck singleton;

    private LazyManThreadSafeDoubleCheck(){}

    public static LazyManThreadSafeDoubleCheck getSingleton(){
        if (singleton == null){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazyManThreadSafeDoubleCheck.class){
                if (singleton == null){
                    singleton = new LazyManThreadSafeDoubleCheck();
                }
            }
        }
        return singleton;
    }
}
