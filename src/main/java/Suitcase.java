import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;
    private int suitcaseWeight;

    public int getSuitcaseWeight() {
        return suitcaseWeight;
    }

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }
    public void addItem(Item item) {
        if ((this.suitcaseWeight + item.getWeight()) <= this.maximumWeight) {
            this.items.add(item);
            this.suitcaseWeight += item.getWeight();
        }
    }
    public void printItems() {
    //    System.out.println("The suitcase contains the following items:");
        for (Item iterate : this.items) {
            System.out.println(iterate);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Item iterate : this.items) {
            totalWeight += iterate.getWeight();
        }
        return totalWeight;
    }
    public  Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        for (Item iterate : this.items) {
            if (iterate.getWeight() > heaviest.getWeight()) {
                heaviest = iterate;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        String output = this.items.size() + " items (" + this.suitcaseWeight + " kg)";

        if (this.items.isEmpty()) {
            output = "no items (" + this.suitcaseWeight + " kg)";
        }
        if (this.items.size() == 1) {
            output = this.items.size() + " item (" + this.suitcaseWeight + " kg)";
        }

        return output;
    }
}
