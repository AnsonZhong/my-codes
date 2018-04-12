package anson.zhong;

public class LazyManNotThreadSafeBetter {
    private static LazyManNotThreadSafeBetter singleton;

    private LazyManNotThreadSafeBetter(){}

    public static LazyManNotThreadSafeBetter getSingleton(){
        if (singleton == null){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazyManNotThreadSafeBetter.class){
                singleton = new LazyManNotThreadSafeBetter();
            }
        }
        return singleton;
    }
}
