public class Laptop extends Device implements Messaging{
    private final String application;

    public Laptop(String name, String brand, int year) {
        super(name, brand, year);
        this.application = "Skype";
    }

    @Override
    public void dial() {
        System.out.printf("The %s %s produced in %d and can dial the numbers using %s.%n",
                getBrand(), getName(), getYear(), application);
    }

    @Override
    public void show() {
        dial();
        sendMessage();
    }

    @Override
    public void sendMessage() {
        System.out.printf("The %s %s can sent messages using %s.%n",
                getBrand(), getName(), application);
    }
}
