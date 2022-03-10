public class Telephone extends Device{
    private final String dialInterface;

    public Telephone(String name, String brand, int year) {
        super(name, brand, year);
        this.dialInterface = "push-button";
    }

        @Override
    public void dial() {
        System.out.printf("The %s %s produced in %d and can dial the numbers using %s interface.%n",
                getBrand(), getName(), getYear(), dialInterface);
    }

    @Override
    public void show() {
        dial();
    }
}
