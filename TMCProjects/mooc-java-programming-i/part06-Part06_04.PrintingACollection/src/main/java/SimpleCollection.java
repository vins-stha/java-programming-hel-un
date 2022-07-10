
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

    public String printElements() {
        if (this.elements.size() > 0) {
            for (String element : this.elements) {
                return element;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        String message;
        String elementName;
        if (elements.size() == 0) {
            message = " is empty.";
        } else if (elements.size() == 1) {
            message = " has 1 element:\n" + this.printElements();
        } else {
            message = " has " + elements.size() + " elements:\n";

            for (String element : elements) {
                message += element + "\n";
            }
        }
        return "The collection "+this.name + message;
    }
}
