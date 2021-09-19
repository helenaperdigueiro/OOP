package checkpointI;

public enum Gender {
    MALE('M'),
    FEMALE('F');

    private char abbreviation;

    Gender(char abbreviation) {
        this.abbreviation = abbreviation;
    }

    public char getAbbreviation() {
        return abbreviation;
    }
}
