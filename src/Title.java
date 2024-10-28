public abstract class Title {

    private String title;
    private String literatureType;
    protected int copies;
    protected double rate = 0.067574;

    //method to calculate the payout
    public double calculateRoyalty() {
       return calculatePoints() * rate;
    }

    protected abstract double calculatePoints();

    protected abstract double calculateLiteraturePoints();

    //method to create literature pieces

    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    //Getters and setters

    public String getLiteratureType() {
        return literatureType;
    }

    public int getCopies() {
        return copies;
    }
}
