import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    // adds the gift passed as a parameter to the package
    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    // which returns the total weight of the package's gifts
    public int totalWeight() {
        int total = 0;
        for (Gift gift : gifts) {
            total += gift.getWeight();

        }
        return total;
    }

    @Override
    public String toString() {
        String message="";
        for(Gift gift:this.gifts){
            message += gift.toString() + "\n";
        }
        return "Gifts inside package: \n" + message;
    }
}
