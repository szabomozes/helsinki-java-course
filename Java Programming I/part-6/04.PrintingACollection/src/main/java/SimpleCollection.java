
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if (elements.size() == 0) {
            return "The collection " + this.getName() + " is empty.";
        } else if (elements.size() == 1) {
            String text = "The collection " + this.getName() + " has " + elements.size() + " element:\n";
            text = text + elements.get(0);
            return text;
        }
        String text = "The collection " + this.getName() + " has " + elements.size() + " elements:\n";
        for (int i = 0; i < elements.size(); i++) {
            text = text + elements.get(i) + "\n";
        }
        return text;
    }

}
