public class PrintedBook extends Title {
    private int pages;
    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    //Getters and setters

    @Override
    protected double calculatePoints() {
        return pages * getCopies() * calculateLiteraturePoints();

    }

    //Method to calculate points for printed books.

    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI","TE" -> 3 ;
            case "LYRIK" -> 6;
            case "SKØN" -> 1.7;
            case "FAG" -> 1;
            default -> 0.0;
        };
    }
}