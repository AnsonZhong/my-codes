package anson.zhong;

public class HungryManStatic {
    private static HungryManStatic singleton ;

    static {
        singleton = new HungryManStatic();
    }

    private HungryManStatic(){}

    public static HungryManStatic getSingleton(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
