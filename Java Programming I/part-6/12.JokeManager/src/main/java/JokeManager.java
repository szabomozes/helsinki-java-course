import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class JokeManager {
    private ArrayList<String> jokes;

    public JokeManager() {
        Scanner scanner = new Scanner(System.in);
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.size() == 0) {
            return "Jokes are in short supply.";
        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

    public ArrayList<String> getJokes() {
        return jokes;
    }
}
