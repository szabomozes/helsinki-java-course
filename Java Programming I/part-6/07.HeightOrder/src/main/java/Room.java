import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        persons.add(person);
    }

    public boolean isEmpty() {
        return persons.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }
        int shortestHeight = getPersons().get(0).getHeight();
        Person shortestPerson = getPersons().get(0);

        for (Person person : persons) {
            if (person.getHeight() < shortestHeight) {
                shortestHeight = person.getHeight();
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        int shortestHeight = getPersons().get(0).getHeight();
        Person shortestPerson = getPersons().get(0);

        for (Person person : persons) {
            if (person.getHeight() < shortestHeight) {
                shortestHeight = person.getHeight();
                shortestPerson = person;
            }
        }
        persons.remove(shortestPerson);
        return shortestPerson;
    }
}
