import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item i : items) {
            totalWeight = totalWeight + i.getWeight();
        }
        if (!(totalWeight + item.getWeight() > maximumWeight)) {
            items.add(item);
        }
    }

    public String toString() {
        int numberOfItems = items.size();
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight = totalWeight + item.getWeight();
        }
        if (numberOfItems == 0) {
            return "no items (0 kg)";
        } else if (numberOfItems == 1) {
            return numberOfItems + " item (" + totalWeight + " kg)";
        }
        return numberOfItems + " items (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (items.size() == 0) {
            return null;
        }
        int heaviestWeight = items.get(0).getWeight();
        Item heaviestItem = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviestWeight) {
                heaviestWeight = item.getWeight();
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    public ArrayList<Item> getSuitCase() {
        return items;
    }
}
