package homeworks.IMA;
import java.util.ArrayList;

public class Inventory {
    public static ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<Item>();
    }

    public void addItem(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        items.add(newItem);
    }
        public void removeItem(int id) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getId() == id) {
                    items.remove(i);
                    break;
                }
            }
        }

    public String viewItems() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            sb.append("ID: " + item.getId() + " Name: " + item.getName() + " Quantity: " + item.getQuantity() + " Price: " + item.getPrice()+"\n");
        }
        return sb.toString();
    }

        public void updateQuantity(int id, int newQuantity) {
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getId() == id) {
                    items.get(i).setQuantity(newQuantity);
                    break;
                }
            }
        }
    public ArrayList<Item> getItems() {
        return items;
    }
}
