import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    // add the person passed as a parameter to the list.
    public void add(Person person) {
        this.room.add(person);
    }

    //  returns a boolean-type value true or false, that tells whether the room is empty or not.
    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }
        return false;
    }

    //  returns a list of the room in the room
    public ArrayList<Person> getPersons() {
        return this.room;
    }

    // returns the shortest person added to the room
    public Person shortest() {
        int shortHeight = 0;
        if (this.room.isEmpty()) {
            return null;
        }
        Person shortPerson = this.room.get(0);
        for (Person person : this.room) {
            if (person.getHeight() < shortPerson.getHeight()) {
                shortPerson = person;

            }
        }

        return shortPerson;
    }

    // takes the shortest person in the room
    public Person take(){
        if(this.room.isEmpty()) {
            return null;
        }
        Person takeaway = this.shortest();
        this.room.remove(this.shortest());
       return takeaway;
    }
}
