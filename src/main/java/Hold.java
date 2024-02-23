import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;
    private int suitcaseWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {
        if ((this.suitcaseWeight + suitcase.getSuitcaseWeight()) <= this.maximumWeight) {
            this.suitcases.add(suitcase);
            this.suitcaseWeight += suitcase.getSuitcaseWeight();
        }
    }
    public void printItems() {
        //    System.out.println("The suitcase contains the following Suitcases:");
        for (Suitcase iterate : this.suitcases) {
            iterate.printItems();
        }
    }

    @Override
    public String toString() {
        String output = this.suitcases.size() + " suitcases (" + this.suitcaseWeight + " kg)";

        if (this.suitcases.isEmpty()) {
            output = "no suitcases (" + this.suitcaseWeight + " kg)";
        }
        if (this.suitcases.size() == 1) {
            output = this.suitcases.size() + " suitcase (" + this.suitcaseWeight + " kg)";
        }

        return output;
    }
}
