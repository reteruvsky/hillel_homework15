package coffee.order;

public class Order {
    private int number;
    private String name;

    public Order(int number, String name) {
        setNumber(number);
        setName(name);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Order number: " + getNumber()
                + " Order name: " + getName();
    }
}
