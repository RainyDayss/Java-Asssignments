

class LivingRoom extends Home {
    String roomName = "Living Room";

    @Override
    void noOfLights(int noOfLights) {
        super.noOfLights(noOfLights);
    }
}


class BedRoom extends Home {
    String roomName = "Bed Room";

    @Override
    void noOfLights(int noOfLights) {
        super.noOfLights(noOfLights);
    }
}

class GuestRoom extends Home {

    String roomName = "Guest Room";

    @Override
    void noOfLights(int noOfLights) {
        super.noOfLights(noOfLights);
    }
}


class StoreRoom extends Home {
    String roomName = "Store Room";

    @Override
    void noOfLights(int noOfLights) {
        super.noOfLights(noOfLights);
    }
}


public class Home {

    void noOfLights(int noOfLights) {
        System.out.println(" It has " + noOfLights + "  Lights");
    }

    public static void main(String[] args) {
        BedRoom bR = new BedRoom();
        GuestRoom gR = new GuestRoom();
        LivingRoom lR = new LivingRoom();
        StoreRoom sR = new StoreRoom();
        System.out.println("This is " + bR.roomName);
        bR.noOfLights(4);
        System.out.println("This is " + gR.roomName);
        gR.noOfLights(5);
        System.out.println("This is " + lR.roomName);
        lR.noOfLights(6);
        System.out.println("This is " + sR.roomName);
        sR.noOfLights(2);

    }
}