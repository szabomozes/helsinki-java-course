import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase s : suitcases) {
            totalWeight = totalWeight + s.totalWeight();
        }
        if (!(totalWeight + suitcase.totalWeight() > maximumWeight)) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        if (suitcases.isEmpty()) {
            return "0 suitcases (0 kg)";
        }
        int numberOfSuitcases = suitcases.size();
        int totalHoldWeight = 0;
        for (Suitcase suitcase : suitcases) {
            totalHoldWeight += suitcase.totalWeight();
        }
        return numberOfSuitcases + " suitcases (" + totalHoldWeight + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : suitcases) {
            for (Item item : suitcase.getSuitCase()) {
                System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
            }
        }
    }
}
