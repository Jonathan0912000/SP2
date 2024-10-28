public class AudioBook extends Title {
    private int durationInMinutes;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }
//getters and setters

    //method to calculate points

    @Override
    protected double calculatePoints() {
        return (durationInMinutes * 0.5) * getCopies() * calculateLiteraturePoints();
    }

    //Switch to calculate points for audiobooks.

    @Override
    protected double calculateLiteraturePoints() {
        return switch (getLiteratureType()) {
            case "BI", "TE"-> 1.5;
            case "LYRIK" -> 3;
            case "SKØN" -> 0.85;
            case "FAG" -> 0.5;
            default -> 0.0;
        };
    }
}