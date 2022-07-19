import java.util.ArrayList;

public class Hold {

    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if ((suitcase.totalWeight() + this.totalSuitcaseWeight()) <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalSuitcaseWeight() {
        int total = 0;
        for (Suitcase suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    // 3 suitcases
    @Override
    public String toString() {
        String message = " suitcases (" + this.totalSuitcaseWeight() + " kg)";
        if (this.suitcases.isEmpty()) {
            return "no" + message;
        }
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + this.totalSuitcaseWeight() + " kg)";
        }
        return this.suitcases.size() + message;

    }
}
