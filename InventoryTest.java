package homeworks.IMA;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InventoryTest {

    @Test
    public void testAddItem() {
        Inventory inventory = new Inventory();
        inventory.addItem(1, "item1", 10, 100.0);
        Item item = inventory.getItems().get(0);
        assertEquals(1, item.getId());
        assertEquals("item1", item.getName());
        assertEquals(10, item.getQuantity());
        assertEquals(100.0, item.getPrice(), 0.01);
    }

    @Test
    public void testRemoveItem() {
        Inventory inventory = new Inventory();
        inventory.addItem(1, "item1", 10, 100.0);
        inventory.addItem(2, "item2", 20, 200.0);
        inventory.removeItem(1);
        Item item = Inventory.items.get(0);
        assertEquals(2, item.getId());
        assertEquals("item2", item.getName());
        assertEquals(20, item.getQuantity());
        assertEquals(200.0, item.getPrice(), 0.01);
    }

    @Test
    public void testViewItems() {
        Inventory inventory = new Inventory();
        inventory.addItem(1, "item1", 10, 100.0);
        inventory.addItem(2, "item2", 20, 200.0);
        String expected = "ID: 1 Name: item1 Quantity: 10 Price: 100.0\nID: 2 Name: item2 Quantity: 20 Price: 200.0\n";
        assertEquals(expected, inventory.viewItems());
    }

    @Test
    public void testUpdateQuantity() {
        Inventory inventory = new Inventory();
        inventory.addItem(1, "item1", 10, 100.0);
        inventory.updateQuantity(1, 15);
        Item item = Inventory.items.get(0);
        assertEquals(15, item.getQuantity());
    }
}