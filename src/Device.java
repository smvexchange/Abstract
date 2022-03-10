abstract public class Device {
    private final String name;
    private final String brand;
    private final int year;

    public Device(String name, String brand, int year) {
        this.name = name;
        this.brand = brand;
        this.year = year;
    }

    abstract public void dial();
    abstract public void show();

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}
