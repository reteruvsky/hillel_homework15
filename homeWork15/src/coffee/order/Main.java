package coffee.order;

public class Main {
    public static void main(String[] args) {
        Order first = new Order(1, "Alen");
        Order second = new Order(2, "Yoda");
        Order third = new Order(3, "Obi-van");
        Order fourth = new Order(4, "John Snow");

        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();


        coffeeOrderBoard.add(first);
        coffeeOrderBoard.add(second);
        coffeeOrderBoard.add(third);
        coffeeOrderBoard.add(fourth);

        for (Order arr : coffeeOrderBoard.getList()) {
            System.out.println(arr);
        }


        System.out.println();
        coffeeOrderBoard.draw();


        coffeeOrderBoard.deliver();
        System.out.println();

        for (Order arr : coffeeOrderBoard.getList()) {
            System.out.println(arr);
        }


        System.out.println(coffeeOrderBoard.deliver(2));
    }
}
