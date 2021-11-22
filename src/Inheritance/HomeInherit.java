
public class HomeInherit {

    void noOfLights(int noOfLights) {
        System.out.println("Home has " + noOfLights + " lights");
    }

    public static void main(String[] args) {
        BedRoom1 bR1 = new BedRoom1();
        GuestRoom1 gR1 = new GuestRoom1();
        LivingRoom1 lR1 = new LivingRoom1();
        StoreRoom1 sR1 = new StoreRoom1();
        bR1.noOfLights(6);
        gR1.noOfLights(5);
        lR1.noOfLights(6);
        sR1.noOfLights(2);

    }
}

class LivingRoom1 extends HomeInherit {

    void noOfLights(int noOfLights) {
        System.out.println("Living room has " + noOfLights + " lights");
    }
}


class BedRoom1 extends HomeInherit {

    void noOfLights(int noOfLights) {
        System.out.println("Bedroom has " + noOfLights + " lights");
    }
}

class GuestRoom1 extends HomeInherit {

    void noOfLights(int noOfLights) {
        System.out.println("GuestRoom has " + noOfLights + " lights");
    }
}

class StoreRoom1 extends HomeInherit {
    void noOfLights(int noOfLights) {
        System.out.println("StoreRoom has " + noOfLights + " lights");
    }
}
