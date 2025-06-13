import java.util.ArrayList;

public class Stack {
    ArrayList<String> data = new ArrayList<>();

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public void add(String value) {
        data.add(value);
    }

    public ArrayList<String> values() {
        return data;
    }

    public String take() {
        String lastValue = data.get(data.size() - 1);
        data.remove(data.size() - 1);
        return lastValue;
    }

}
