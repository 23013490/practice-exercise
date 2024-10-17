class Vehicle {
    public void displayInfo() {
        System.out.println("Transports passengers");
    }
}

class Sudan extends Vehicle {
    @Override
    public void displayInfo() {
        System.out.println("Land based vehicle");
    }
}

public class Main {
    public static void main(String[] args) {
        Sudan j1 = new Sudan();
        j1.displayInfo();

        Vehicle l1 = new Vehicle();
        l1.displayInfo();
    }
}
