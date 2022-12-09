package coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();


        coffeeOrderBoard.add("Alen");
        coffeeOrderBoard.add("Yoda");
        coffeeOrderBoard.add("Obi-van");
        coffeeOrderBoard.add("John Snow");

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
