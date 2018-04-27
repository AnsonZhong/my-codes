package top.spring.ioc.bean;

public class Master {
    private Annimal[] pets;

    public Master(Annimal[] pets) {
        this.pets = pets;
    }

    public void play(){
        System.out.println("我有"+ this.pets.length +"个宠物");
        for (Annimal pet:this.pets){
            pet.saySomething();
        }
    }
}
