package pl.klikwplik.domain;

public enum Position {
    GKP(1),
    DEF(2),
    MID(3),
    FWD(4);

    private int ordinal;

    Position(int ordinal) {
        this.ordinal = ordinal;
    }

    public int getOrdinal() {
        return ordinal;
    }
}
