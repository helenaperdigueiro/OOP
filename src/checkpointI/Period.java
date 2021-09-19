package checkpointI;

public enum Period {
    MORNING("Morning"),
    AFTERNOON("Afternoon"),
    EVENING("Evening");

    private String periodName;

    Period(String period) {
        this.periodName = period;
    }

    public String getPeriodName() {
        return periodName;
    }
}
