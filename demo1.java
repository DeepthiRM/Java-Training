package Assignments;

import java.util.ArrayList;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();

        items.add(new Item("Book - Harry potter", 1, 1155.22));
        items.add(new Item("Soap - pears", 5, 50.69));
        items.add(new Item("paratha - alu", 10, 20.00));
        items.add(new Item("Softdrinks - cock", 1, 40.99));
        items.add(new Item("rice - brown", 1, 120.99));

        Order order = new Order(1, "Deepthi", items);
        order.displayOrder();

    }

}


class Order {

    private int orderId;
    private String customer;
    // items
    private List<Item> items;
    private double netTotal;

    public Order(int orderId, String customer, List<Item> items) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = items;
        this.netTotal = 0;
        for (Item item : items) {
            netTotal += item.getPrice();
        }
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public void displayOrder() {
        System.out.printf("Order Id: %d  %50s %n", orderId,  customer);
        System.out.printf("%50s %n", "Items");
        for (Item item : items) {
            System.out.printf("%20s %d %4.2f %4.2f %n", 
                item.getName(), item.getQuantity(), item.getPrice(), item.getTotalCost());
        }
        System.out.printf("============================================================================%n");
        System.out.printf("Net Total: %4.2f %n", netTotal);

    }


}


class Item {

    private String name;
    private int quantity;
    private double price;
    private double totalCost;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalCost = quantity * price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }


}