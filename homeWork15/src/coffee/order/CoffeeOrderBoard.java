package coffee.order;

import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private Queue<Order> list = new LinkedList<>();
    private int orderNumber;

    public Queue<Order> getList() {
        return list;
    }

    public void add(String name) {
        orderNumber++;
        list.add(new Order(orderNumber, name));
    }

    public Order deliver() {
        return list.poll();
    }

    public Order deliver(int number) {
        for (Order arr : list) {
            if (number == arr.getNumber()) ;
            list.remove(arr);
            return arr;
        }
        return null;
    }

    public void draw() {
        System.out.println("=============");
        System.out.println("Num   |   Name");
        for (Order arr : list) {
            System.out.println(arr.getNumber() + "   |   " + arr.getName());
        }
    }
}
