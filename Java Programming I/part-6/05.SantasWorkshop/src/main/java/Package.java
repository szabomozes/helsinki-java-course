import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int total = 0;
        for (int i = 0; i < gifts.size(); i++) {
            total = total + gifts.get(i).getWeight();
        }
        return total;
    }

}
