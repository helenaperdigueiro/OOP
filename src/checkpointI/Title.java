package checkpointI;

public enum Title {
    HIGHER_EDUCATION("Higher Education"),
    POSTGRADUATE("Postgraduate"),
    EXPERTISE("Expertise"),
    MASTER("Master"),
    DOCTORATE("Doctorate");

    private String titleName;

    Title(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleName() {
        return titleName;
    }
}
