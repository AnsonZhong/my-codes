package anson.zhong;

public class Demo {

    public static void main(String[] args) {
        for (int i=0; i<100;i++){
            new Thread(new Runnable() {
                public void run() {
                    //HungryManNoStatic hungry = HungryManNoStatic.getSingleton();
                    //LazyManNotThreadSafe hungry = LazyManNotThreadSafe.getSingleton();
                    //LazyManNotThreadSafeBetter hungry = LazyManNotThreadSafeBetter.getSingleton();
                    //HungryManStatic hungry = HungryManStatic.getSingleton();
                    //LazyManThreadSafe hungry = LazyManThreadSafe.getSingleton();
                    //LazyManThreadSafeDoubleCheck hungry = LazyManThreadSafeDoubleCheck.getSingleton();
                    //LazyManThreadSafeInnerClass hungry = LazyManThreadSafeInnerClass.getSingleton();
                    Singleton hungry = Singleton.INSTANCE;
                    System.out.println(hungry.print());
                }
            }).start();
        }
    }
}
