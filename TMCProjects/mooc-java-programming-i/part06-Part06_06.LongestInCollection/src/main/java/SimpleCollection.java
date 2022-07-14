
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

    //  returns the longest string of the collection
    public String longest() {
        String longest = "";
        if (this.elements.isEmpty()) {
            return null;
        }
        for (String element : elements) {
            if (element.length() > longest.length()) {
                longest = element;
            }

        }
        return longest;
    }

}
