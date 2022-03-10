public class MobilePhone extends Device implements Messaging, Photographing{
    private final String callingModule;

    public MobilePhone(String name, String brand, int year) {
        super(name, brand, year);
        this.callingModule = "touch screen";
    }

    @Override
    public void dial() {
        System.out.printf("The %s %s was produced in %d and can dial the numbers using a %s.%n",
                getBrand(), getName(), getYear(), callingModule);
    }

    @Override
    public void show() {
        dial();
        sendMessage();
        takePicture();
    }

    @Override
    public void sendMessage() {
        System.out.printf("The %s %s can send messages using different applications.%n",
                getBrand(), getName());
    }

    @Override
    public void takePicture() {
        System.out.printf("The %s %s can take a picture using an integrated photo cam.%n",
                getBrand(), getName());
    }
}
