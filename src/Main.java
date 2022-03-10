public class Main {

    public static void main(String[] args) {
        Device[] devices = new Device[3];
        devices[0] = new Telephone("KX-TS23", "Panasonic", 2000);
        devices[1] = new MobilePhone("P50 pro", "Huawei", 2021);
        devices[2] = new Laptop("ID50K", "ASUS", 2010);
        for (Device device : devices) {
            device.show();
        }
    }
}
