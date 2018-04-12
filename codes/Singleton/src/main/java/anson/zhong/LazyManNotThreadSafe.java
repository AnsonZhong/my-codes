package anson.zhong;

public class LazyManNotThreadSafe {
    private static LazyManNotThreadSafe singleton;

    private LazyManNotThreadSafe(){}

    public static LazyManNotThreadSafe getSingleton(){
        if (singleton == null){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singleton = new LazyManNotThreadSafe();
        }
        return singleton;
    }

}
