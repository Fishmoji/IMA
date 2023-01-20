package homeworks.IMA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add item to inventory");
            System.out.println("2. Remove item from inventory");
            System.out.println("3. View all items in inventory");
            System.out.println("4. Update quantity of an item");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {System.out.println("Enter item ID:");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Enter item name:");
                String name = scanner.nextLine();

                System.out.println("Enter item quantity:");
                int quantity = scanner.nextInt();

                System.out.println("Enter item price:");
                double price = scanner.nextDouble();

                inventory.addItem(id, name, quantity, price);
            } else if (choice == 2) {
                System.out.println("Enter item ID:");
                int id = scanner.nextInt();

                inventory.removeItem(id);
            } else if (choice == 3) {
                inventory.viewItems();
            } else if (choice == 4) {
                System.out.println("Enter item ID:");
                int id = scanner.nextInt();

                System.out.println("Enter new quantity:");
                int newQuantity = scanner.nextInt();

                inventory.updateQuantity(id, newQuantity);
            } else if (choice == 5) {
                break;
            }
        }

        scanner.close();
    }
}