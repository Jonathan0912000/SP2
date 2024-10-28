import java.util.ArrayList;
import java.text.DecimalFormat;



public class Author {
    private String name;
    private static ArrayList<Title> titles = new ArrayList<>();

    public Author(String name) {
        setName(name);
        titles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void addTitle(Title title) {
        titles.add(title);
    }

    //calculating the amount to be paid out.

    public double calculateTotalPay() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return (float) total;
    }

    //secures that the amount only has 2 decimals

    private static final DecimalFormat df = new DecimalFormat("0.00");
    @Override
    public String toString() {
        return name + ": " + df.format(calculateTotalPay()) + " kr";
    }
}
