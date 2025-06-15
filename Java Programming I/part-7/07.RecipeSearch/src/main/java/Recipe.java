import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public void add(String ingredient) {
        ingredients.add(ingredient);
    }

    public String toString() {
        return name + ", cooking time: " + time;
    }

    public boolean wordInName(String word) {
        return name.contains(word);
    }

    public boolean timeIsLessThan(int upperLimit) {
        return time <= upperLimit;
    }

    public boolean containsTheIngredient(String ingredient) {
        boolean contains = false;
        for (String i : ingredients) {
            if (i.equals(ingredient)) {
                contains = true;
                return true;
            }
        }
        return contains;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
}
