import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if ((this.totalWeight() + item.getWeight()) <= this.maximumWeight) {
            this.items.add(item);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Item item : this.items) {
            total += item.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);

        for (Item item : this.items) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public String toString() {
        String message = " items (" + this.totalWeight() + " kg)";
        if (this.items.isEmpty()) {
            return "no" + message;
        }
        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + message;

    }
}
