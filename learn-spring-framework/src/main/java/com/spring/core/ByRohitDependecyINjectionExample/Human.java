package com.spring.core.ByRohitDependecyINjectionExample;

public class Human {


    private Addressable adress;
    public Human(Addressable adress){
        this.adress=adress;
    }
    public  void printAdress(){
    adress.getAdress();
    }

    public static void main(String args[]) {
        Addressable adress = new Adress();
        Human human = new Human(adress);
        human.printAdress();


        Addressable newAdress= new NewAdress();
        Human humanwithnewAdress=new Human(newAdress);
        humanwithnewAdress.printAdress();
    }
}
