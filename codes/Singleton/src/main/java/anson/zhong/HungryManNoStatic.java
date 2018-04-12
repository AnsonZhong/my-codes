package anson.zhong;

public class HungryManNoStatic {
    private static HungryManNoStatic singleton = new HungryManNoStatic();

    private HungryManNoStatic(){}

    public static HungryManNoStatic getSingleton(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return singleton;
    }

}
