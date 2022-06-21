
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals(Object person) {
        if (person instanceof Person) {
            if (
                    ((Person) person).name.equals(this.name)
                    && this.height == ((Person) person).height
                    && this.weight == ((Person) person).weight
                    && this.birthday.getDay() == ((Person) person).birthday.getDay()
                    && this.birthday.getMonth() == ((Person) person).birthday.getMonth()
                    && this.birthday.getYear() == ((Person) person).birthday.getYear()) {
                return true;
            }
        }
        return false;
    }
}
